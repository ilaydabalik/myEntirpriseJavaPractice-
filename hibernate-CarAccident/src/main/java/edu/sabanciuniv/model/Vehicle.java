package edu.sabanciuniv.model;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int year;
    private String plate;

    //Bir aracın bir müşterisi olabilir.
    //Vehicle ben çok araç olabilirim ama benim bir tane sahibim olabilir.
    @ManyToOne
    private Customer customer;

    //Bir aracın hiç kazası olamayabilir ya da birden fazla kazası olabilir.
    //Accident tablosunda vehicle'ı nasıl tuttuk? vehicleList ile tuttuk.
    @ManyToMany(mappedBy = "vehicleList")
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


    public void setYear(int year) {
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public List<Accident> getAccidentList() {
        return accidentList;
    }

    public void setAccidentList(List<Accident> accidentList) {
        this.accidentList = accidentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                ", plate='" + plate + '\'' +
                '}';
    }
}
