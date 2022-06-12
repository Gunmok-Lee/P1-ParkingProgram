package P1.ParkingProgram.handler;

import java.util.Iterator;
import java.util.List;
import P1.ParkingProgram.domain.Car;
import P1.ParkingProgram.util.Prompt;

public class CarHandler {

    List<Car> carList;
    MemberHander memberHander;
    Car car;

    public CarHandler(List<Car> list, MemberHandler memberHandler) {
        this.carList = list;
        this.memberHander = memberHandler;
    }

    public void park() {
        System.out.println(x: "\n[차량 주차]");
    }
    
}
