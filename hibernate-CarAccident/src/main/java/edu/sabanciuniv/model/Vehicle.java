package edu.sabanciuniv.model;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private int year;
    private String plate;

    //Bir aracın bir müşterisi olabilir.
    private Customer customer;

    //Bir aracın hiç kazası olamayabilir ya da birden fazla kazası olabilir.
    private List<Accident> accidentList = new ArrayList<>();

    public Vehicle(int year, String plate) {
        this.year = year;
        this.plate = plate;

    }

    public Vehicle() {
    }

    public int getYear() {
        return year;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                ", plate='" + plate + '\'' +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
