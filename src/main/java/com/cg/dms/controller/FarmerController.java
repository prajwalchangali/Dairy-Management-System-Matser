package com.cg.dms.controller;

import com.cg.dms.entities.Farmer;
import com.cg.dms.service.IFarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/f")
public class FarmerController {

    @Autowired
    private IFarmerService iFarmerService;

    @GetMapping("/farmer")
    public List<Farmer> getAllFarmer() {
        return iFarmerService.getAllFarmer();
    }

    @PostMapping("/farmer")
    public Farmer addFarmer(@RequestBody Farmer user){

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        user.setFarmerId(0);
        iFarmerService.addFarmer(user);
        return user;
    }

    @PutMapping("/farmer")
    public Farmer updateFarmer(@RequestBody Farmer farmer) {

        iFarmerService.addFarmer(farmer);

        return farmer;
    }
}