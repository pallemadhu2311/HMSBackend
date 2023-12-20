package com.HostelManagementSystem.HMSBackend.Authentication;

import com.HostelManagementSystem.HMSBackend.Authentication.ApplicationUser;
import com.HostelManagementSystem.HMSBackend.Authentication.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    public boolean authenticateUser(String username, String password){
        ApplicationUser user = applicationUserRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            // Log successful login
            System.out.println("Successful login for user: " + username);

            return true; // successful login
        } else {
            // Log failed login
            System.out.println("Failed login attempt for user: " + username);

            return false; // invalid login
        }
    }
}
