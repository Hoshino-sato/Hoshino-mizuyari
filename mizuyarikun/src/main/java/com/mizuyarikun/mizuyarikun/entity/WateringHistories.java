package com.mizuyarikun.mizuyarikun.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WtHistories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int plantId;
    private LocalDateTime WtDate;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}