package com.mizuyarikun.mizuyarikun.repository;

import com.mizuyarikun.mizuyarikun.entity.PlantPlace;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantPlaceRepository extends JpaRepository<PlantPlace, byte[]> {
    
    @Query(value = "SELECT a.id, a.name, a.frequency, a.place_id, b.place_name, b.description, c.watering_date, a.created_at, a.updated_at FROM plants AS a LEFT JOIN places AS b ON a.place_id = b.id LEFT JOIN watering_histories AS c ON a.id = c.plant_id", nativeQuery = true)
    List<PlantPlace> findAllTest();
}