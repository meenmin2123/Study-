package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("--ElectricCar--");
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        System.out.println("--gasCar--");
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
