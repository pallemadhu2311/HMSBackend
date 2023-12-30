package com.HostelManagementSystem.HMSBackend.Hostels;

// Importing necessary Spring Framework annotations and classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Declaring the class as a REST controller with a base mapping
@RestController
@RequestMapping("api/hostels")
@CrossOrigin(origins = "http://localhost:4200")
public class HostelController {

    // Injecting HostelService dependency using Spring's @Autowired annotation
    @Autowired
    private HostelService hostelService;

    // Handling HTTP POST requests to register a new hostel
    @PostMapping
    public ResponseEntity<Hostel> registerHostel(@RequestBody Hostel hostel){
        // Calling the saveHostel method of HostelService to save the hostel in the database
        Hostel savedHostel = hostelService.saveHostel(hostel);
        // Returning a ResponseEntity with the saved hostel and HTTP status 200 (OK)
        return ResponseEntity.ok(savedHostel);
    }
}
