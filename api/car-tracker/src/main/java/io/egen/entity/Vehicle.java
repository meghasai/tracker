package io.egen.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Vehicle")
public class Vehicle {

    @Id
    @Column(name = "Veh")
    private String vin;
    private String make;
    private String model;
    private String year;

    private double maxFuelVolume;
    private Integer redlineRpm;
    private String lastServiceDate;


    public String getvin() {
        return vin;
    }

    public void setvin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public double getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setMaxFuelVolume(double maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public Integer getRedlineRpm() {
        return redlineRpm;
    }

    public void setRedlineRpm(Integer redlineRpm) {
        this.redlineRpm = redlineRpm;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
}
