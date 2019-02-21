package com.dsc.gl_homotics.Model;

import java.util.List;

public class Raspberry {
    private String ipAddress;
    private String password;
    private String remoteUserName;
    private String typeController;
    private List<Room> rooms;

    public Raspberry() {
    }

    public Raspberry(String ipAddress, String password, String remoteUserName, String typeController, List<Room> rooms) {
        this.ipAddress = ipAddress;
        this.password = password;
        this.remoteUserName = remoteUserName;
        this.typeController = typeController;
        this.rooms = rooms;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRemoteUserName(String remoteUserName) {
        this.remoteUserName = remoteUserName;
    }

    public void setTypeController(String typeController) {
        this.typeController = typeController;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getPassword() {
        return password;
    }

    public String getRemoteUserName() {
        return remoteUserName;
    }

    public String getTypeController() {
        return typeController;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
