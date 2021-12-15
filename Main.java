/*
* This program uses the HaokaiStack class
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

import java.util.Scanner;

/**
* This is the standard "lock" program.
*/
final class Main {
    /**
    * The zero.
    */
    private static final int ZERO = 0;
    /**
    * The two.
    */
    private static final int TWO = 2;
    /**
    * The four.
    */
    private static final int FOUR = 4;
    /**
    * The two hundred.
    */
    private static final int TWOOO = 200;
    /**
    * The five hundred.
    */
    private static final int FIVEOO = 500;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final HaokaiStack aStack1 = new HaokaiStack(FOUR, ZERO, TWOOO);
        final Scanner userInput = new Scanner(System.in);

        System.out.print(
            "Please enter the License plate number of first car: "
        );
        final String licensePlateNumber = userInput.nextLine();
        System.out.print(
            "Please enter the Colour of first car: "
        );
        final String color = userInput.nextLine();
        aStack1.push(licensePlateNumber, color);
        aStack1.showStack();

        System.out.print(
            "Please enter the Accelerate of first car: "
        );
        final int accelerateNumber = userInput.nextInt();
        aStack1.accelerate(accelerateNumber);
        aStack1.showStack();

        System.out.print(
            "Please enter the Brake of first car: "
        );
        final int brakeNumber = userInput.nextInt();
        aStack1.brake(brakeNumber);
        aStack1.showStack();

        final HaokaiStack aStack2 = new HaokaiStack(TWO, ZERO, FIVEOO);

        System.out.print(
            "Please enter the License plate number of second car: "
        );
        final String licensePlateNumber2 = userInput.nextLine();
        System.out.print(
            "Please enter the Colour of second car: "
        );
        final String color2 = userInput.nextLine();
        aStack2.push(licensePlateNumber2, color2);
        aStack2.showStack();

        System.out.print(
            "Please enter the Accelerate of second car: "
        );
        final int accelerateNumber2 = userInput.nextInt();
        aStack2.accelerate(accelerateNumber2);
        aStack2.showStack();

        System.out.print(
            "Please enter the Brake of second car: "
        );
        final int brakeNumber2 = userInput.nextInt();
        aStack2.brake(brakeNumber2);
        aStack2.showStack();

        System.out.println("\nDone.");
    }
}
