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

    public static PlantScheduleDto of(PlantPlace plantPlace) {

        PlantScheduleDto plantScheduleDto = new PlantScheduleDto();

        plantScheduleDto.id(plantPlace.id);
        plantScheduleDto.name(plantPlace.name);
        plantScheduleDto.frequency(plantPlace.getFrequency());
                plantScheduleDto.placeId(plantPlace.placeId);
                plantScheduleDto.placeName(plantPlace.placeName);
                plantScheduleDto.descreption(plantPlace.descreption);
                plantScheduleDto.watering_date(plantPlace.watering_date);
                plantScheduleDto.createdAt(plantPlace.createdAt);
                plantScheduleDto.updatedAt(plantPlace.updatedAt);
        
                private LocalDateTime[] wateringSchedule;
        
            }
        
            private void frequency(int frequency) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'frequency'");
            }
}