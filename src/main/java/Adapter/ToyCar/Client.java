package Adapter.ToyCar;

import Adapter.ToyCar.Adapter.AmbulanceCarAdapter;
import Adapter.ToyCar.Adapter.PoliceCarAdapter;
import Adapter.ToyCar.Controller.CarController;

public class Client {
    public static void main(String args[]) {
        CarController car ;
        car = new PoliceCarAdapter();
        car.move();
        car.phonate();
        car.twinkle();
        
        System.out.println();
        
        car = new AmbulanceCarAdapter();
        car.move();
        car.phonate();
        car.twinkle();
        
    }
}
