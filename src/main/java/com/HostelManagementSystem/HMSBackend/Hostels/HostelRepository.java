package com.HostelManagementSystem.HMSBackend.Hostels;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HostelRepository extends JpaRepository<Hostel,Long> {
    List<Hostel> findHostelsByUsername(String username);
}
