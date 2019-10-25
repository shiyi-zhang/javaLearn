package org.zsy.dto;

/**
 * @author 张世一
 * @version 1.0
 */

public class CarDto {
    private String make;
    private int seatCount;
    private String type;

    public CarDto() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CarDto(String make, int seatCount, String type) {
        this.make = make;
        this.seatCount = seatCount;
        this.type = type;
    }
}
