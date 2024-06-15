package at.spengergasse.hawara.controllers;

import at.spengergasse.hawara.domain.Users;
import at.spengergasse.hawara.exceptions.NotFoundException;
import at.spengergasse.hawara.persistence.UsersRepository;
import at.spengergasse.hawara.service.UsersService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("all")
    public String homePage(Model model) {
        model.addAttribute("listAllUsers", usersService.getAllUsers());
        return "index";
    }
}
//    @GetMapping
//    List<Users> all() {
//        return repository.findAll();
//    }
//
//    @PostMapping
//    Users newUser(@RequestBody Users newUser) {
//        return repository.save(newUser);
//    }
//
//    @GetMapping("/{userId}")
//    Users one(@PathVariable Long userId) throws NotFoundException {
//        return repository.findById(userId)
//                .orElseThrow(() -> new NotFoundException("User with ID " + userId + " does not exist"));
//    }
//
//    @PutMapping("/{userId}")
//    Users replaceUser(@RequestBody Users newUser, @PathVariable Long userId) {
//        return repository.findById(userId)
//                .map(user -> {
//                    user.setUsername(newUser.getUsername());
//                    user.setPassword(newUser.getPassword());
//                    user.setEmail(newUser.getEmail());
//                    return repository.save(user);
//                })
//                .orElseGet(() -> {
//                    newUser.setId(userId);
//                    return repository.save(newUser);
//                });
//    }
//
//    @DeleteMapping("/{userId}")
//    void deleteUser(@PathVariable Long userId) {
//        repository.deleteById(userId);
//    }
//}