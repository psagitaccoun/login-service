package com.login.controller;

import com.login.model.User;
import com.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;


   //localhost:8081/home/user
    @GetMapping("/user")
    public List<User> getUsers(){
        System.out.println("getting all users!!");
        List<User> users = userService.getUsers();
        return users;
    }

    @GetMapping("/current-user")
    public String getUser(Principal principal){
        return principal.getName();
    }
}
