package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a radius: ");
    double radius = input.nextDouble();
    double area = Circle.getArea(radius);
    System.out.print("The area of circle of radius: " + radius + " is " + area);
    }
}
