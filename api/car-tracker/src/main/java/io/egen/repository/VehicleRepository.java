package io.egen.repository;


import io.egen.entity.Vehicle;

public interface VehicleRepository {

    public Vehicle findVehicleByVin(String vin);
    public String createVehicle(Vehicle vehicle);
    public String updateVehicle(Vehicle vehicle);

}
