package com.HostelManagementSystem.HMSBackend;

import com.HostelManagementSystem.HMSBackend.User;
import com.HostelManagementSystem.HMSBackend.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    //used it for register the user
    public User registerUser(User user){
        return  userRepo.save(user);
    }



    // get all the registered username [used in signup users data]
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    //fetch the user details based on the username
    public User findByUsername(String username){
        return userRepo.findByUsername(username);
    }
}
