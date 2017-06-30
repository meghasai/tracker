package io.egen.controller;


import io.egen.entity.Vehicle;
import io.egen.entity.VehicleReading;
import io.egen.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://mocker.egen.io", maxAge = 3600)
public class VehicleController {

    @Autowired
    VehicleService service;

    @RequestMapping(value="/vehicles",method = RequestMethod.PUT,consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String loadVehicles(@RequestBody  List<Vehicle> vehicles)
    {

        return service.loadVehicles(vehicles);
    }



}
