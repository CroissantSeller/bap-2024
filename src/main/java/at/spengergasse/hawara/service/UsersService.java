package at.spengergasse.hawara.service;
import at.spengergasse.hawara.domain.Users;
import at.spengergasse.hawara.persistence.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService{

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

    public void save(Users users){
        usersRepository.save(users);
    }

    public void updateUser(Users users){
        usersRepository.save(users);
    }

    public void deleteUser(Long id){
        usersRepository.deleteById(id);
    }
}