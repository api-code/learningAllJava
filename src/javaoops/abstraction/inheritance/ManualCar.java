package javaoops.abstraction.inheritance;

public class ManualCar extends Car{
    private int currentGear;

    public ManualCar(String brand,String model) {
        super(brand,model);
        this.currentSpeed=0;
    }

    // Specialized method for Manual Car
    public void shiftGear(int gear) {
        this.currentGear = gear;
        System.out.println(brand + " " + model + " : Shifted to gear " + currentGear);
    }
}
