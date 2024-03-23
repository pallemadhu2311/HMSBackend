package com.HostelManagementSystem.HMSBackend.AddRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/addrooms")
@CrossOrigin(origins = "http://localhost:4200")
public class AddRoomController {
    @Autowired
    private AddRoomService addRoomService;

    // create a new room
    @PostMapping("/newroom")
    public  AddRoom createRoom(@RequestBody AddRoom addRoom){
        return addRoomService.createRoom(addRoom);
    }
}
