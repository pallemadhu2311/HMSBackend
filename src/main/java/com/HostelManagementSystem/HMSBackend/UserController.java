package com.HostelManagementSystem.HMSBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    //sending all the registered users into the database
    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody User user){
        User registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    //getting all the signup data
    // http://localhost:8080/api/users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // http://localhost:8080/api/users/profile?username=test
    @GetMapping("/profile")
    public ResponseEntity<User> getUserProfile(@RequestParam String username){
        User user = userService.findByUsername(username);

        if(user != null){
            return ResponseEntity.ok(user);
        }
        else{
            return ResponseEntity.notFound().build();
        }

    }



}
