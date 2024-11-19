package extends1.overriding;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("ElectricCar moving~~");
    }

    public void charge() {
        System.out.println("ElectricCar charging");
    }
}
