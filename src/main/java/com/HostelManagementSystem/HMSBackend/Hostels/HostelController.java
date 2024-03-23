    package com.HostelManagementSystem.HMSBackend.Hostels;

    // Importing necessary Spring Framework annotations and classes
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.Optional;

    // Declaring the class as a REST controller with a base mapping
    @RestController
    @RequestMapping("/api/hostels")
    @CrossOrigin(origins = "http://localhost:4200")
    public class HostelController {

        @Autowired
        private HostelService hostelService;

        @PostMapping(value = "/register", consumes = "multipart/form-data")
        public ResponseEntity<?> registerHostel(@ModelAttribute Hostel hostel){
            try {

                // Create a Hostel object with the extracted parameters
                Hostel savedHostel = hostelService.saveHostel(hostel);
                return ResponseEntity.ok(savedHostel);
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }

        @GetMapping("/allhostels")
        public List<Hostel> getAllHostels() {
            return hostelService.getAllHostels();
        }


        @GetMapping("/hostelsdata")
        public ResponseEntity<List<Hostel>> getHostelsByUsername(@RequestParam("username") String username){
            List<Hostel> hostels = hostelService.getHostelsByUsername(username);
            return new ResponseEntity<>(hostels, HttpStatus.OK);
        }



    }

