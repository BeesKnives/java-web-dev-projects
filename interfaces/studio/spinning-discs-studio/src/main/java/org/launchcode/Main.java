package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD ("Cosmic Love", 5);
        DVD myDVD = new DVD ("Pacific Rim", 125);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.playMedia();
        myCD.stop(4);
        System.out.println(myCD.getCurrentMinutes());
        myCD.stop(31);
        System.out.println(myCD.getCurrentMinutes());
        myCD.rewind();
        System.out.println(myCD.getCurrentMinutes());

        System.out.println("__________________________");

        myDVD.playMedia();
        myDVD.stop(4);
        System.out.println(myDVD.getCurrentMinutes());
        myDVD.stop(31);
        System.out.println(myDVD.getCurrentMinutes());
        myDVD.rewind();
        System.out.println(myDVD.getCurrentMinutes());


    }
}