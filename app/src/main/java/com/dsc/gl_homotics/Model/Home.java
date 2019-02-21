package com.dsc.gl_homotics.Model;

import java.util.List;

public class Home {
    private List<User> users;
    private List<Raspberry> raspberries;


    public Home() {
    }

    public Home(List<User> users, List<Raspberry> raspberries) {
        this.users = users;
        this.raspberries = raspberries;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Raspberry> getRaspberries() {
        return raspberries;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setRaspberries(List<Raspberry> raspberries) {
        this.raspberries = raspberries;
    }
}
