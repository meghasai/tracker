package io.egen.repository;


import io.egen.entity.Vehicle;
import io.egen.entity.VehicleReading;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class VehicleReadingRepositoryImpl implements VehicleReadingRepository{

    @PersistenceContext
    private EntityManager entityManager;
    /*public VehicleReading findVehicleReadingByVin(String id) {
        return null;
    }*/

    public String createVehicleReading(VehicleReading vehicleReading) {
        entityManager.persist(vehicleReading.getTires());
        entityManager.persist(vehicleReading);
        return null;
    }

    /*public String updateVehicleReading(Vehicle vehicle) {
        return null;
    }*/
}
