package com.mizuyarikun.mizuyarikun.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private byte[] id;

    private String name;
    private int frequency;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
