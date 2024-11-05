package com.mizuyarikun.mizuyarikun.repository;

import com.mizuyarikun.mizuyarikun.entity.Places;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacesRepository extends JpaRepository<Places, Integer> {
}