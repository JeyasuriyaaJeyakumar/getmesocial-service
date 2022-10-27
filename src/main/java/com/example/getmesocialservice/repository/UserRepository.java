package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getuser(){

        User user = new User("John doe","Canada", 26, "https://profilepicurl.com");
        return user;
    }
}
