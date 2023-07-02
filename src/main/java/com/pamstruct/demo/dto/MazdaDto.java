package com.pamstruct.demo.dto;

import com.pamstruct.demo.Car;
import lombok.Data;

@Data
public class MazdaDto extends Car {
    private Boolean isStolen = Boolean.FALSE;
}
