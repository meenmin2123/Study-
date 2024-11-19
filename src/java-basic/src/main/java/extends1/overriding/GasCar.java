package extends1.overriding;

public class GasCar extends Car {

    @Override
    public void move() {
        super.move();
    }

    public void fillUp() {
        System.out.println("GasCar filling Up ");
    }
}
