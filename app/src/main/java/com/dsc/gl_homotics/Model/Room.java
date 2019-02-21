package com.dsc.gl_homotics.Model;

import java.util.List;

public class Room {
    private String roomName;
    private String roomType;
    private int numberFloor;
    private List<HObject> hObjects;

    public Room() {
    }

    public Room(int numberFloor, String roomName, String roomType, List<HObject> hObjects) {
        this.numberFloor = numberFloor;
        this.roomName = roomName;
        this.roomType = roomType;
        this.hObjects = hObjects;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void sethObjects(List<HObject> hObjects) {
        this.hObjects = hObjects;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public List<HObject> gethObjects() {
        return hObjects;
    }
}
