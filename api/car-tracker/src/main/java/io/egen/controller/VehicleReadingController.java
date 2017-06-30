package io.egen.controller;

import io.egen.entity.VehicleReading;
import io.egen.service.VehicleReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://mocker.egen.io", maxAge = 3600)
public class VehicleReadingController {

    @Autowired
    VehicleReadingService service;
    @RequestMapping(value="/readings",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String loadVehicleReadings(@RequestBody VehicleReading reading )
    {
        return service.loadVehicleReadings(reading);
    }
}
