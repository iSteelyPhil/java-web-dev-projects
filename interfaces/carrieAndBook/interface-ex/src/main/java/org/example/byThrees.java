package org.example;

public class byThrees implements Series{
    int val;

    byThrees(){
        val = 0;
    }

    public int getNext(){
        val += 3;
        return val;
    }

    public int getPrev() {
        val -= 3;
        return val;
    }
}