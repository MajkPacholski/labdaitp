package com.pamstruct.demo.dto;

import com.pamstruct.demo.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BmwE60DTO extends Car {
    private Boolean isEngineRoar = Boolean.FALSE;
}