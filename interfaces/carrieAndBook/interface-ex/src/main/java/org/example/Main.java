package org.example;

public class Main {
    public static void main(String[] args) {
        byTwos byTwos = new byTwos();
        byThrees byThrees = new byThrees();
        Text testText = new Text();

        byTwos.printStuff();

        Series ob;

        for(int i = 0; i<6;i++){

            ob = byTwos;
            /*System.out.println(byTwos.getNext());*/
            /*System.out.println(byThrees.getNext());*/
            System.out.println("By Twos: " + ob.getNext());

          /*  ob = byThrees;
            System.out.println("By Threes: " + ob.getNext());*/


        }

        System.out.println(testText.getText());
        System.out.println(Series.MAX);


    }
}
