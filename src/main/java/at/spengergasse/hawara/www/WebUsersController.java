package at.spengergasse.hawara.www;


import at.spengergasse.hawara.domain.Users;
import at.spengergasse.hawara.persistence.AssetsRepository;
import at.spengergasse.hawara.persistence.UsersRepository;
import at.spengergasse.hawara.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class WebUsersController {
    @Autowired
    private UsersService usersService;
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/all")
    public String homePage(Model model) {
        List<Users> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users/dashboard";
    }

    @GetMapping("/addUser")
    public String register(Model model) {
        model.addAttribute("UsersRequest", UsersRequest.base());
        return "users/addusers";
    }


    @PostMapping("/addUser")
    public String register(@ModelAttribute("UsersRequest") Users users, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "users/addusers";
        }
        if( users.getPassword().getPassword().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!*()]).{8,100}$")){
            usersService.save(Users.builder().email(users.getEmail()).username(users.getUsername()).password(users.getPassword()).build());
            return "redirect:/users/all";
        }
        return "redirect:/users/addUser";

    }
    @GetMapping("/updateUsers/{id}")
    public String updateUser(Model model, @PathVariable Long id) {
        Optional<Users> user = usersRepository.findById(id);
        model.addAttribute("UsersRequest", user);
        return "users/updateusers";
    }
    @PostMapping("/updateUsers/{id}")
    public String updateUser(@ModelAttribute("UsersRequest") Users newUser, @PathVariable Long id){
        if( newUser.getPassword().getPassword().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!*()]).{8,100}$")){
            Users user = usersRepository.findById(id)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid user id:" + id));
            user.setPassword(newUser.getPassword());
            user.setUsername(newUser.getUsername());
            user.setEmail(newUser.getEmail());
            usersService.updateUser(user);
            return "redirect:/users/all";
        }
        return "redirect:/users/updateUsers/{id}";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id ) {
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user id:" + id));
        usersRepository.delete(user);
        return "users/dashboard";
    }
}