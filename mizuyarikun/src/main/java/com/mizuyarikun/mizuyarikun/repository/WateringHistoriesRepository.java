package com.mizuyarikun.mizuyarikun.repository;

import com.mizuyarikun.mizuyarikun.entity.WateringHistories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WateringHistoriesRepository extends JpaRepository<WateringHistories, Integer> {
}