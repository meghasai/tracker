package io.egen.service;

import io.egen.entity.VehicleReading;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface VehicleReadingService {

    String loadVehicleReadings(VehicleReading readings);
}
