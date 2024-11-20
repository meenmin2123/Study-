package poly.ex4;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("댕댕");
    }

    @Override
    public void move() {
        System.out.println("댕댕이 발견!");
    }
}
