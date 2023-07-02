package com.pamstruct.demo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Long id;
    private String brand;
    private String model;
    private Integer yearOfProduction;
    private String color;
    private Factory factory;
}