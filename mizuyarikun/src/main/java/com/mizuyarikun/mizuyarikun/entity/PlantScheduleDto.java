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
public class PlantScheduleDto {

    private byte[] id;
    private String name;
    private int frequency;
    private int placeId;
    private String placeName;
    private String description;
    private LocalDateTime watering_date;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public static PlantScheduleDto of(PlantPlace plantPlace) {
        
        PlantScheduleDto plantScheduleDto = new PlantScheduleDto();
        
        plantScheduleDto.setId(plantPlace.getId());
        plantScheduleDto.setName(plantPlace.getName());
        plantScheduleDto.setFrequency(plantPlace.getFrequency());
        plantScheduleDto.setPlaceId(plantPlace.getPlaceId());
        plantScheduleDto.setPlaceName(plantPlace.getPlaceName());
        plantScheduleDto.setDescription(plantPlace.getDescription());
        plantScheduleDto.setWatering_date(plantPlace.getWatering_date());
        plantScheduleDto.setCreatedAt(plantPlace.getCreatedAt());
        plantScheduleDto.setUpdatedAt(plantPlace.getUpdatedAt());


        return plantScheduleDto;
    }
}
