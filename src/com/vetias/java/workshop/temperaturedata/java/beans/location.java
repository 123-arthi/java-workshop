package com.vetias.java.workshop.temperaturedata.java.beans;

public class location {
    private String name;
    private double latitude;
    private double longitude;
    private String descripton;
    private String county;
    private String city;
    private String address;
    private String postalcode;

    public void setname(String aName) {
        name= aName;
    }
    public String getName(){
        return name;
    }
}
