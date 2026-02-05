package javaoops.abstraction.polymorphism;

public class ManualCarSD extends Cars{
        private int currentGear;

        public ManualCarSD(String brand, String model) {
            super(brand, model);
            this.currentGear = 0;
        }

        //Specialized method for Manual Car
        public void shiftGear(int gear) {
            currentGear = gear;
            System.out.println(brand + " " + model + " : Shifted to gear " + currentGear);
        }

        // Overriding accelerate - Dynamic Polymorphism
        @Override
        public void accelerate() {
            if (!isEngineOn) {
                System.out.println(brand + " " + model + " : Cannot accelerate! Engine is off.");
                return;
            }
            currentSpeed += 20;
            System.out.println(brand + " " + model + " : Accelerating to " + currentSpeed + " km/h");
        }

        //overriding and overloading accelerate at the same time.
        @Override
        public void accelerate(int speed) {
            if (!isEngineOn) {
                System.out.println(brand + " " + model + " : Cannot accelerate! Engine is off.");
                return;
            }
            currentSpeed += speed;
            System.out.println(brand + " " + model + " : Accelerating to " + currentSpeed + " km/h");
        }

        // Overriding brake - Dynamic Polymorphism
        @Override
        public void brake() {
            currentSpeed -= 20;
            if (currentSpeed < 0) currentSpeed = 0;
            System.out.println(brand + " " + model + " : Braking! Speed is now " + currentSpeed + " km/h");
        }
    }

