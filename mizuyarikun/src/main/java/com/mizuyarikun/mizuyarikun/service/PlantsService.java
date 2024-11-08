package com.mizuyarikun.mizuyarikun.service;

import com.mizuyarikun.mizuyarikun.entity.PlantPlace;
import com.mizuyarikun.mizuyarikun.entity.Plants;
import com.mizuyarikun.mizuyarikun.repository.PlantPlaceRepository;
import com.mizuyarikun.mizuyarikun.repository.PlantsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantsService {

    @Autowired
    private  PlantPlaceRepository plantsRepository;
    
    public List<PlantPlace> getAllPlants() {

        System.out.println(plantsRepository.findAllTest());

        return plantsRepository.findAllTest();
    }

}
