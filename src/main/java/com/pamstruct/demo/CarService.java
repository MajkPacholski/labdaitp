package com.pamstruct.demo;

import com.pamstruct.demo.dto.BmwE60DTO;
import com.pamstruct.demo.dto.MazdaDto;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class CarService {

    @PostConstruct
    void init(){
        Car car = new BmwE60DTO();
        Car car2 = new MazdaDto();
        ((BmwE60DTO)car).setIsEngineRoar(Boolean.TRUE);

        displayData(car);
        displayData(car2);

    }

    private Car bmwE60 = Car.builder()
            .id(1L)
            .brand("BMW")
            .color("Red")
            .model("E60")
            .yearOfProduction(2006)
            .build();

    private Factory factory = Factory.builder()
            .id(1L)
            .city("Warsaw")
            .company("Booba")
            .employeeNumber(500)
            .employeeToOneCar(20)
            .build();

    private final BmwE60Mapper bmwE60Mapper;

    public void map(){



    }

    public void displayData(Car car){
        if (car instanceof BmwE60DTO){
            log.error("Dealing with BMW E60 with engine: {}", ((BmwE60DTO)car).getIsEngineRoar());
        } else if (car instanceof MazdaDto){
            log.error("Dealing with Mazda which is stolen: {}", ((MazdaDto)car).getIsStolen());
        }
    }
}
