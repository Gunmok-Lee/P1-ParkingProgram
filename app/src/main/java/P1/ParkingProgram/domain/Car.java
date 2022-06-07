package P1.ParkingProgram.domain;

import java.time.*;
// 이전 교육생 때는 DATE 클래스를 사용하였으나 현재는 주로 TIME 클래스를 사용한다고 한다.
// 주차시간으로 날짜와 시간 모두 출력이 필요하므로 LocalDateTime을 이용한다.

public class Car {
    private String carNo; // 차량번호
    private int carType; // 차량종류 1.경차 2.승용차 3.SUV 4.전기차 5.수소차(데이터를 최소화 하기 위해 int로 저장한다.)
    private int parkedLocation; // 주차구역
    private LocalDateTime inTime; // 입차시간
    private LocalDateTime outTime; // 출차시간

    LocalDateTime now = LocalDateTime.now();
    // LocalDateTime을 이용하여 날짜와 시간 모두를 가져온다.
  
    public String getCarNo() {
      return carNo;
    }
    public int getCarType() {
      return carType;
    }
    public int getParkedLocation() {
      return parkedLocation;
    }
    public LocalDateTime getInTime() {
      return inTime;
    }
    public LocalDateTime getOutTime() {
      return outTime;
    }
    public void setCarNo(String carNo) {
      this.carNo = carNo;
    }
    public void setCarType(int carType) {
      this.carType = carType;
    }
    public void setParkedLocation(int parkedLocation) {
      this.parkedLocation = parkedLocation;
    }
    public void setInTime() {
      this.inTime = now;
    }
    public void setOutTime() {
      this.outTime = now;
    }
  }
  