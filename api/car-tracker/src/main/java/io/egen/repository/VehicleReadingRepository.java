package io.egen.repository;

import io.egen.entity.Vehicle;
import io.egen.entity.VehicleReading;

import java.util.List;

public interface VehicleReadingRepository {

    //public VehicleReading findVehicleReadingByVin(String id);
    public String createVehicleReading(VehicleReading vehicleReading);
    //public String updateVehicleReading(Vehicle vehicle);

}
