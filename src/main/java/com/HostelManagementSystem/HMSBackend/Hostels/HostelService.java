package com.HostelManagementSystem.HMSBackend.Hostels;

// Importing necessary Spring Framework annotations and classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;


// Declaring the class as a service component in the Spring context
@Service
public class HostelService {
    // Injecting HostelRepository dependency using Spring's @Autowired annotation
    @Autowired
    // Method to save a Hostel entity to the database
    private HostelRepository hostelRepository;
    public Hostel saveHostel(Hostel hostel){
        // Calling the save method of HostelRepository to persist the Hostel entity
        hostel.setCreatedat(new Date());
        hostel.setUpdatedat(new Date());
        return hostelRepository.save(hostel);
    }


    public List<Hostel> getAllHostels() {
        return hostelRepository.findAll();
    }

=
}
