package com.mizuyarikun.mizuyarikun.service;

import com.mizuyarikun.mizuyarikun.entity.Plants;
import com.mizuyarikun.mizuyarikun.repository.PlantsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantsService {

    @Autowired
    private PlantsRepository plantsRepository;

    public List<Plants> getAllPlants() {

        return plantsRepository.findAll();
    }

    public Optional<Plants> getPlantById(Long id) {
        return plantsRepository.findById(id);
    }

    public Plants createPlant(Plants user) {
        return plantsRepository.save(user);
    }

    public Plants updatePlant(Long id, Plants userDetails) {
        Plants user = plantsRepository.findById(id).orElseThrow(() -> new RuntimeException("Plants not found"));
        user.setName(userDetails.getName());
        //user.setEmail(userDetails.getEmail());
        return plantsRepository.save(user);
    }

    public void deletePlant(Long id) {
        plantsRepository.deleteById(id);
    }
}
