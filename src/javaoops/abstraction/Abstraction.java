package javaoops.abstraction;

public class Abstraction {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("Ford", "Mustang");

        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.accelerate();
        myCar.shiftGear(2);
        myCar.accelerate();
        myCar.brake();
        myCar.stopEngine();

        //Setting arbitrary value to speed.
        myCar.currentSpeed = 500;
        System.out.println("Current Speed of My Sports Car is set to " + myCar.currentSpeed);
    }
}
