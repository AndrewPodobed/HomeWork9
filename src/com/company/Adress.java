package com.company;

public class Adress {
    private String city;
    private String street;
    private int numberHome;


    public Adress(String city, String street, int numberHome){
        this.city = city;
        this.street = street;
        this.numberHome = numberHome;
    }


    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberHome() {
        return numberHome;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumberHome(int numberHome) {
        this.numberHome = numberHome;
    }

    @Override
    public String toString(){
        return " адрес: " + city + ", " + street + ", " + numberHome;
    }



}
