package com.HostelManagementSystem.HMSBackend.AddRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddRoomService {
    @Autowired
    private AddRoomRepository addRoomRepository;

    // Get all rooms
    public List<AddRoom> getAllRooms(){
        return addRoomRepository.findAll();
    }

    //create a new room or save the room
    public AddRoom createRoom(AddRoom addRoom){
        return addRoomRepository.save(addRoom);
    }

}
