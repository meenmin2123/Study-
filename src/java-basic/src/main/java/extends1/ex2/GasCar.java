package extends1.ex2;

public class GasCar extends Car {

    @Override
    public void move() {
        super.move();
    }

    public void fillUp() {
        System.out.println("GasCar filling Up ");
    }
}
