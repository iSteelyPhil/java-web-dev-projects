package org.example;

public class byTwos implements SeriesSub {
    int val;

    byTwos() {
        val = 0;
    }

    public int getNext() {
        if (val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 2;
        }
        return val;
    }

    public int getPrev() {
        val -= 2;
        return val;
    }
}