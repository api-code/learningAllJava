package javaoops.abstraction.polymorphism;


// Main function
public class StaticAndDynamicPolymorphism {
    public static void main(String[] args) {
        Cars myManualCar = new ManualCarSD("Ford", "Mustang");
        myManualCar.startEngine();
        myManualCar.accelerate();
        myManualCar.accelerate();
        myManualCar.brake();
        myManualCar.stopEngine();

        System.out.println("----------------------");

        Cars myElectricCar = new ElectricCarSD("Tesla", "Model S");
        myElectricCar.startEngine();
        myElectricCar.accelerate();
        myElectricCar.accelerate();
        myElectricCar.brake();
        myElectricCar.stopEngine();
    }
}