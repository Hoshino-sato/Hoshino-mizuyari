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
        @Getter@Setter
        plantScheduleDto.id(plantPlace.id);
        plantScheduleDto.name(plantPlace.name);
        plantScheduleDto.frequency(plantPlace.getFrequency);
        plantScheduleDto.placeId(plantPlace.placeId);
        plantScheduleDto.placeName(plantPlace.placeName);
        plantScheduleDto.descreption(plantPlace.descreption);
        plantScheduleDto.watering_date(plantPlace.watering_date);
        plantScheduleDto.createdAt(plantPlace.createdAt);
        plantScheduleDto.updatedAt(plantPlace.updatedAt);

        private LocalDateTime[] wateringSchedule;

    }
        
}