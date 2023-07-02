package com.pamstruct.demo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Factory {
    private Long id;
    private String city;
    private String company;
    private Integer employeeNumber;
    private Integer employeeToOneCar;
    private Integer peopleDelegateToProdOneCar;
}
