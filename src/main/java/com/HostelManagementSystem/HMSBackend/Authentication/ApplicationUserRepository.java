package com.HostelManagementSystem.HMSBackend.Authentication;


import com.HostelManagementSystem.HMSBackend.Authentication.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser,Long> {
    ApplicationUser findByUsername(String username);
}
