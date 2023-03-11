package edu.sabanciuniv.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {

    private String fullName;
    private String address;
    private long ssid;
    private String phoneNumber;

    private List<Vehicle> vehicleList = new ArrayList<>();

    public Customer(String fullName, String address, long ssid, String phoneNumber) {
        this.fullName = fullName;
        this.address = address;
        this.ssid = ssid;
        this.phoneNumber = phoneNumber;
    }
    public Customer() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSsid() {
        return ssid;
    }

    public void setSsid(long ssid) {
        this.ssid = ssid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (ssid != customer.ssid) return false;
        return Objects.equals(phoneNumber, customer.phoneNumber);
    }

    @Override
    public int hashCode() {
        int result = (int) (ssid ^ (ssid >>> 32));
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", ssid=" + ssid +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
