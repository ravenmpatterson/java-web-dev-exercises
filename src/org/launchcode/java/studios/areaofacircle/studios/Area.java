package org.launchcode.java.studios.areaofacircle.studios;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What is the radius of the circle: ");
        radius = input.nextDouble();
        while(radius < 0) {
            System.out.print("Please enter a positive number. Try again:");
            radius = input.nextDouble();
        }
        input.close ();

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is " + area);
    }
}
