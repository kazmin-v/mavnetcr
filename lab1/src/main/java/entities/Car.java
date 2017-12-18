package entities;

import java.util.UUID;

/**
 * This class will contain only one car
 */
public class Car {
    private String brand;
    private String year;
    private String id;

    /**
     * constructors
     */
    public Car(String b, String y, String i){
        brand = b;
        year =y;
        id =i;
    }

    public Car(String b, String y){
        brand = b;
        year =y;
        id = UUID.randomUUID().toString();;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
