package com.cg.dms.service;

import com.cg.dms.entities.Farmer;
import com.cg.dms.repository.IFarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFarmerService {

    @Autowired
    private IFarmerRepository iFarmerRepository;

    public List<Farmer> getAllFarmer() {
        return iFarmerRepository.findAll();
    }

    public void addFarmer(Farmer user){
        iFarmerRepository.save(user);
    }

}