package extends1.ex2;

public class ElectricCar extends Car {

    @Override
    public void move() {
        super.move();
    }

    public void charge() {
        System.out.println("ElectricCar charging");
    }
}
