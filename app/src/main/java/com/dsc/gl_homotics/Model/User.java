package com.dsc.gl_homotics.Model;

public class User {
    private String address;
    private int age;
    private long dateOfBirth;
    private String fName;
    private String lName;
    private String phoneNumber;
    private String region;
    private String city;
    private AccountUser accountUser;

    public User() {
    }

    public User(String address, int age, long dateOfBirth, String fName, String lName, String phoneNumber, String region, String city, AccountUser accountUser) {
        this.address = address;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.region = region;
        this.city = city;
        this.accountUser = accountUser;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAccountUser(AccountUser accountUser) {
        this.accountUser = accountUser;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public AccountUser getAccountUser() {
        return accountUser;
    }
}
