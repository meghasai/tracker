package io.egen.service;


import io.egen.entity.Vehicle;
import io.egen.entity.VehicleReading;

import java.util.List;

public interface VehicleService {

    String loadVehicles(List<Vehicle> vehicles);

}
