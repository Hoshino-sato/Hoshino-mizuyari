package com.mizuyarikun.mizuyarikun.controller;

import com.mizuyarikun.mizuyarikun.entity.PlantPlace;
import com.mizuyarikun.mizuyarikun.entity.Plants;
import com.mizuyarikun.mizuyarikun.service.PlantsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("watering/list")
public class WateringController {

    @Autowired
    private PlantsService plantsService;

    @GetMapping
    public List<PlantPlace> getAllPlants() {

        return plantsService.getAllPlants();
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Plants> getPlantById(@PathVariable Long id) {
    //     return plantsService.getPlantById(id)
    //             .map(ResponseEntity::ok)
    //             .orElse(ResponseEntity.notFound().build());
    // }

}