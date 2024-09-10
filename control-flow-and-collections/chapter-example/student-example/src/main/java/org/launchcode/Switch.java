package org.launchcode;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int dayNum = in.nextInt();

        String day;
        if (dayNum == 0) {
            day = "Sunday";
        } else if (dayNum == 1){
            day = "Monday";
        } else if (dayNum == 2){
            day = "Tuesday";
        } else if (dayNum == 3){
            day = "Wednesday";
        } else if (dayNum == 4){
            day = "Thursday";
        } else if (dayNum == 5){
            day = "Friday";
        } else if (dayNum == 6){
            day = "Saturday";
        } else {
            day = "Int does not correspond to a day of the week";
        }
        System.out.println(day);
    }
}
