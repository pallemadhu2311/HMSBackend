package com.HostelManagementSystem.HMSBackend.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody ApplicationUser applicationUser){

        try{
            String username = applicationUser.getUsername();
            String password = applicationUser.getPassword();

            if(authenticationService.authenticateUser(username,password)){
                return ResponseEntity.ok("Login Successful");
            }
            else{
                return ResponseEntity.status(401).body("Authentication Failed");
            }
        }
        catch (Exception e) {
            return ResponseEntity.status(500).body("Internal Server Error");
        }




    }
}
