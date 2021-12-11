package com.endpointREST.controller;

import com.endpointREST.entity.Users;
import com.endpointREST.repository.UsersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miguel Castro
 */
@RestController
@RequestMapping("/users")
public class UsersController {
    
    @Autowired
    UsersRepository usersRepository;
    
    @GetMapping()
    public List<Users> findUsers(){
        
        Users user1 = new Users("Albert Einstein", "albert@email.com");
        Users user2 = new Users("Nikola Tesla", "nikola@email.com");
        Users user3 = new Users("Stephen Hawking", "stephen@email.com");
        
        usersRepository.save(user1);
        usersRepository.save(user2);
        usersRepository.save(user3);
        
        return usersRepository.findAll();
    }
    
}
