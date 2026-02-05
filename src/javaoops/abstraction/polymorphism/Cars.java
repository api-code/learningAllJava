package javaoops.abstraction.polymorphism;

abstract class Cars {
    protected String brand;
    protected String model;
    protected boolean isEngineOn;
    protected int currentSpeed;

    public Cars(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
    }

    //Common methods for All cars.
    public void startEngine() {
        isEngineOn = true;
        System.out.println(brand + " " + model + " : Engine started.");
    }

    public void stopEngine() {
        isEngineOn = false;
        currentSpeed = 0;
        System.out.println(brand + " " + model + " : Engine turned off.");
    }

    public abstract void accelerate();             // Abstract method for Dynamic Polymorphism

    public abstract void accelerate(int speed);    //Abstract method for Static Polymorphism

    public abstract void brake();// Abstract method for Dynamic Polymorphism


}
