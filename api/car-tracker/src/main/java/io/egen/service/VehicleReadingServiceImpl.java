package io.egen.service;

import io.egen.entity.VehicleReading;
import io.egen.repository.VehicleReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleReadingServiceImpl implements VehicleReadingService{
    @Autowired
    VehicleReadingRepository readingRepository;

    @Transactional
    public String loadVehicleReadings(VehicleReading readings) {
            readingRepository.createVehicleReading(readings);
            return "null";
    }
}
