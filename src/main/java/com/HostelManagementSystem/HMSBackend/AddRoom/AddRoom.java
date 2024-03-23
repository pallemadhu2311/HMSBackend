package com.HostelManagementSystem.HMSBackend.AddRoom;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "addrooms")
public class AddRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long roomid;
    private String hostelname;
    private  Integer noofbuildings;
    private  Integer nooffloors;

    private Integer noofrooms;
    private String roomallocationtype;
    private Integer selectedfloor;
    private String roomname;
    private String roomsharetype;
    private String roominfo;
    private Timestamp roomcreatedat;

    private String roomcreatedby;

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public String getHostelname() {
        return hostelname;
    }

    public void setHostelname(String hostelname) {
        this.hostelname = hostelname;
    }

    public Integer getNoofbuildings() {
        return noofbuildings;
    }

    public void setNoofbuildings(Integer noofbuildings) {
        this.noofbuildings = noofbuildings;
    }

    public Integer getNooffloors() {
        return nooffloors;
    }

    public void setNooffloors(Integer nooffloors) {
        this.nooffloors = nooffloors;
    }

    public Integer getNoofrooms() {
        return noofrooms;
    }

    public void setNoofrooms(Integer noofrooms) {
        this.noofrooms = noofrooms;
    }

    public String getRoomallocationtype() {
        return roomallocationtype;
    }

    public void setRoomallocationtype(String roomallocationtype) {
        this.roomallocationtype = roomallocationtype;
    }

    public Integer getSelectedfloor() {
        return selectedfloor;
    }

    public void setSelectedfloor(Integer selectedfloor) {
        this.selectedfloor = selectedfloor;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRoomsharetype() {
        return roomsharetype;
    }

    public void setRoomsharetype(String roomsharetype) {
        this.roomsharetype = roomsharetype;
    }

    public String getRoominfo() {
        return roominfo;
    }

    public void setRoominfo(String roominfo) {
        this.roominfo = roominfo;
    }

    public Timestamp getRoomcreatedat() {
        return roomcreatedat;
    }

    public void setRoomcreatedat(Timestamp roomcreatedat) {
        this.roomcreatedat = roomcreatedat;
    }

    public String getRoomcreatedby() {
        return roomcreatedby;
    }

    public void setRoomcreatedby(String roomcreatedby) {
        this.roomcreatedby = roomcreatedby;
    }
}
