package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons have you used? ");
        Double gallonsUsed = input.nextDouble();

        System.out.println("Your miles-to-gallon average is " + milesDriven/gallonsUsed);

    }

}
