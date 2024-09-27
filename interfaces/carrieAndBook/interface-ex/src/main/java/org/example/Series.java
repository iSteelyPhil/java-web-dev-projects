package org.example;

public interface Series {

    int MAX = 10;
    String ERRORMSG = "CANNOT GO ABOVE VALUE " + MAX;

    int getNext();

    /*int getPrev();*/

    default void printStuff(){
        System.out.println("Check out this STRING");
    }
}
