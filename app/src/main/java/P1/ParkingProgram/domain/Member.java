package P1.ParkingProgram.domain;

import java.time.*;
// 이전 교육생 때는 DATE 클래스를 사용하였으나 현재는 주로 TIME 클래스를 사용한다고 한다.
// 주차시간으로 날짜와 시간 모두 출력이 필요하므로 LocalDateTime을 이용한다.

public class Member {
  private String name; // 이름
  private int tel; // 전화번호
  private int state; // 회원상태 1.일반 2.정기권
  private LocalDateTime registeredTime; // 가입일
  private LocalDateTime endTime; // 정기권 끝나는 날짜

  LocalDateTime now = LocalDateTime.now();
    // LocalDateTime을 이용하여 날짜와 시간 모두를 가져온다.

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int tel() {
    return tel;
  }
  public void tel(int tel) {
    this.tel = tel;
  }
  public int getState() {
    return state;
  }
  public void setState(int state) {
    this.state = state;
  }
  public LocalDateTime getRegisteredTime() {
    return registeredTime;
  }
  public void setRegisteredTime() {
    this.registeredTime = now;
  }
  public LocalDateTime getEndTime() {
    return endTime;
  }
  public void setEndTime() {
    this.registeredTime.plusDays(30);
  }
  // 정기권은 30일 단위의 구독형식을 사용하며 당일 자정까지 사용이 가능하다.
  // 자정 이후에는 일반 회원으로 변경되며 일반 회원의 주차요금이 부과된다.
  
}
