package com.mizuyarikun.mizuyarikun.service;

import com.mizuyarikun.mizuyarikun.CreateSchedule;
import com.mizuyarikun.mizuyarikun.entity.PlantPlace;
import com.mizuyarikun.mizuyarikun.entity.Plants;
import com.mizuyarikun.mizuyarikun.repository.PlantPlaceRepository;
import com.mizuyarikun.mizuyarikun.repository.PlantsRepository;
import com.mizuyarikun.mizuyarikun.CreateSchedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class PlantsService {

    @Autowired
    private  PlantPlaceRepository plantPlaceRepository;
    
    public List<PlantPlace> getAllPlants() {
      
      List<PlantPlace> plantPlace = plantPlaceRepository.findAllTest();

      String testText[] = plantPlace.getWatering_date().toArray();//いったん保留

      //  CreateSchedule.manageCreateSchedule();

        return plantPlaceRepository.findAllTest();
    }

}
