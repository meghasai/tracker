package io.egen.repository;


import io.egen.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public Vehicle findVehicleByVin(String vin) {

        return entityManager.find(Vehicle.class,vin);
    }

    public String createVehicle(Vehicle vehicle) {
        entityManager.persist(vehicle);
        return null;
    }

    public String updateVehicle(Vehicle vehicle) {
        entityManager.merge(vehicle);
        return null;
    }
}
