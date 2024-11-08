package com.mizuyarikun.mizuyarikun.repository;

import com.mizuyarikun.mizuyarikun.entity.PlantPlace;
import com.mizuyarikun.mizuyarikun.entity.Plants;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PlantsRepository extends JpaRepository<Plants, byte[]> {

    @Query(value = "SELECT a.id,a.name, a.place_id, b.place_name, b.description, a.created_at, a.updated_at FROM plants AS a LEFT JOIN places AS b ON a.place_id = b.id", nativeQuery = true)
    List<PlantPlace> findAllTest();

}