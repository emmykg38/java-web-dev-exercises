package exercises;

import java.util.Scanner;

public class Rectangle {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please give the length: ");
        Double length = input.nextDouble();

        System.out.println("Please give the width: ");
        Double width = input.nextDouble();

        System.out.println("The area of the rectangle is: " + width*length);
    }
}
