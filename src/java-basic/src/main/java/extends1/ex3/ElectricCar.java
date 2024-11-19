package extends1.ex3;

public class ElectricCar extends Car {

    @Override
    public void move() {
        super.move();
    }

    public void charge() {
        System.out.println("ElectricCar charging");
    }
}
