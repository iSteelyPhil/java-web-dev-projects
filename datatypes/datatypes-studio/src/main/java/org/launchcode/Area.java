package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /*     ;
            double radius = input.nextDouble();
            double area = Circle.getArea(radius);
            System.out.print("The area of circle of radius: " + radius + " is " + area);*/

        // Bonus 1
/*        System.out.print("Enter a radius: ");

        if (input.hasNextDouble()) {
            double radius = input.nextDouble();

            if (radius > 0) {
                double area = Circle.getArea(radius);
                System.out.print("The area of circle of radius: " + radius + " is " + area);
            } else {
                System.out.println("ERROR; ENTER A RADIUS GREATER THAN ZERO");
            }
        } else{
            System.out.println("Please enter a valid number ");
        }*/
        //Bonus 2
        double radius;
        do {
            System.out.println("Please enter a positive number for the radius: ");

            while (!input.hasNextDouble()){
                System.out.println("The radius must be a number!");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);
        double area = Circle.getArea(radius);
        System.out.print("The area of circle of radius: " + radius + " is " + area);

        input.close();
    }
}
