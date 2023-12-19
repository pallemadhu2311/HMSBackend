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

    public User registerUser(User user){
        return  userRepo.save(user);
    }


    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
