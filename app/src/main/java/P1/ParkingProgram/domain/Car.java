package P1.ParkingProgram.domain;

import java.sql.Time;
//이전 교육생 때는 DATE 클래스를 사용하였으나 현재는 주로 TIME 클래스를 사용한다고 한다.

public class Car {
    private String carNo; // 차량번호
    private int parkedLocation; // 주차구역
    private Time inTime; // 입차시간
    private Time outTime; // 출차시간
  
    public int getCarNo() {
      return carNo;
    }
    public void setCarNo(int carNo) {
      this.carNo = carNo;
    }
    public String getParkedLocation() {
      return parkedLocation;
    }
    public void setInTime(Time inTime) {
      this.inTime = inTime;
    }
    public String getCompany() {
      return company;
    }
    public void setCompany(String company) {
      this.company = company;
    }
    public String getAuthor() {
      return author;
    } 
    public void setAuthor(String author) {
      this.author = author;
    }
    public String getRentAble() {
      return rentAble;
    }
    public void setRentAble(String rentAble) {
      this.rentAble = rentAble;
    }
    public Date getRentDate() {
      return rentDate;
    }
    public void setRentDate(Date rentDate) {
      this.rentDate = rentDate;
    }
    public String getRentOwner() {
      return rentOwner;
    }
    public void setRentOwner(String rentOwner) {
      this.rentOwner = rentOwner;
    }
  }
  