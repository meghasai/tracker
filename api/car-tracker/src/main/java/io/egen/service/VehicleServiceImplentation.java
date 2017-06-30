package io.egen.service;
import io.egen.entity.Vehicle;
import io.egen.entity.VehicleReading;
import io.egen.repository.VehicleReadingRepository;
import io.egen.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class VehicleServiceImplentation implements VehicleService{

    @Autowired
    VehicleRepository vehicleRepository;


    @Transactional
    public String loadVehicles(List<Vehicle> vehicles) {

        for(Vehicle vehicle:vehicles)
        {
            Vehicle vehicle1=vehicleRepository.findVehicleByVin(vehicle.getvin());
            if (vehicle1==null)
                vehicleRepository.createVehicle(vehicle);
            else
                vehicleRepository.updateVehicle(vehicle1);
        }

        return null;
    }


}
