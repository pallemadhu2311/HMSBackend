package com.HostelManagementSystem.HMSBackend;

import com.HostelManagementSystem.HMSBackend.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUsername(String username);

}
