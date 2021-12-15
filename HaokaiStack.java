/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

/**
* This is the standard "lock" program.
*/
public class HaokaiStack {
    /**
    * LicenseNumber.
    */
    private String licenseNumber;
    /**
    * Colour.
    */
    private String colour;
    /**
    * DoorNumber.
    */
    private int doorNumber;
    /**
    * Speed.
    */
    private int speed;
    /**
    * MaxSpeed.
    */
    private int maxSpeed;

    /**
    * HaokaiStack.
    *
    * @param doorNumberInput door
    * @param speedInput speed
    * @param maxSpeedInput maxspeed
    */
    public HaokaiStack(int doorNumberInput, int speedInput, int maxSpeedInput) {
        this.doorNumber = doorNumberInput;
        this.speed = speedInput;
        this.maxSpeed = maxSpeedInput;
    }

    /**
    * And 1 method.
    *
    * @param licenseNumberInput number
    * @param colourInput colour
    *
    */
    public void push(final String licenseNumberInput,
                     final String colourInput) {
        licenseNumber = licenseNumberInput;
        colour = colourInput;
    }

    /**
    * Add stack.
    *
    * @param speedAdd add
    */
    public void accelerate(final int speedAdd) {
        if (speedAdd < 0) {
            this.speed += 0;
        } else if (speedAdd > this.maxSpeed) {
            this.speed += this.maxSpeed;
        } else {
            this.speed += speedAdd;
        }
    }

    /**
    * Minus stack.
    *
    * @param speedMinus minus
    */
    public void brake(final int speedMinus) {
        if (speedMinus < 0) {
            this.speed -= 0;
        } else if (speedMinus > this.speed) {
            this.speed -= this.speed;
        } else {
            this.speed -= speedMinus;
        }
    }

    /**
    * Show stack.
    */
    public void showStack() {
        System.out.println("\nThe License plate number of this car: "
                           + this.licenseNumber
                           + "\nThe Colour of this car: "
                           + this.colour
                           + "\nThe # of doors of this car: "
                           + this.doorNumber
                           + "\nThe Speed of this car: "
                           + this.speed
                           + "\nThe Maximum speed of this car: "
                           + this.maxSpeed
                           + "\n");
    }
}
