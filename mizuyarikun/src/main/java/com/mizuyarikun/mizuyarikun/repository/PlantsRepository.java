package com.mizuyarikun.mizuyarikun.repository;

import com.mizuyarikun.mizuyarikun.entity.Plants;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PlantsRepository extends JpaRepository<Plants, byte[]> {

    @Query("SELECT p FROM Plant p LEFT JOIN p.place pl WHERE p.place.id = pl.id")
    List<Plants> findAllTest();

}