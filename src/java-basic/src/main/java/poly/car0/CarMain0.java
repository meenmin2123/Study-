package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {

        Driver driver = new Driver();
        K3Car k3car = new K3Car();
        driver.setK3Car(k3car);
        driver.drive();

        Model3Car model3car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3car);
        driver.drive();
    }
}
