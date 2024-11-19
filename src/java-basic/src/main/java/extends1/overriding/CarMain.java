package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("--ElectricCar--");
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        System.out.println("--gasCar--");
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        System.out.println("--HydrogenCar--");
        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
        
    }
}
