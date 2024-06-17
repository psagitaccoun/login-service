package com.login.service;

import com.login.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"kiran","kiran@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"anil","anil@gmail.com"));
    }

    public List<User> getUsers(){
        return store;
    }

}
