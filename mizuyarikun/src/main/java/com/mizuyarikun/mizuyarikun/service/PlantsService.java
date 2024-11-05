package com.mizuyarikun.mizuyarikun.service;

import com.mizuyarikun.mizuyarikun.entity.Plants;
import com.mizuyarikun.mizuyarikun.repository.PlantsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantsService {

    @Autowired
    private  PlantsRepository plantsRepository;
    
    public List<Plants> getAllPlants() {

        System.out.println(plantsRepository.findAllTest());

        return plantsRepository.findAllTest();
    }

}
