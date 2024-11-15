package com.mizuyarikun.mizuyarikun.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public  class PlantPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    
    byte[] id;

    private String name;
    private int frequency;
    private int placeId;
    private String placeName;
    private String description;
    private LocalDateTime watering_date;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}