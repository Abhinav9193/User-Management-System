package com.abhinav.Mini.Controller;

import com.abhinav.Mini.Model.User;
import com.abhinav.Mini.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5174/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser)
    {
        return userRepository.save(newUser);
    }

    @GetMapping("/getUsers")
    List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
}
