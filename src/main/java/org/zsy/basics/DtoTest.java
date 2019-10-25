package org.zsy.basics;

import org.zsy.dto.Car;
import org.zsy.dto.CarDto;
import org.zsy.dto.CarMapper;

/**
 * @author 张世一
 * @version 1.0
 */
public class DtoTest {

    public static void main(String[] args) {
        Car car = new Car("Morris", 5, 1);

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
        System.out.println(carDto);
        System.out.println(carDto.getMake()+" Morris");
        System.out.println(carDto.getSeatCount()+" 5");
        System.out.println(carDto.getType()+" 1");
    }
}
