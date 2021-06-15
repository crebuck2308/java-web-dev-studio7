package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD nowHits = new CD("CD", "Now Hits of 2020", "music", 2.5);
        DVD classicMovie1 = new DVD("DVD", "The Good, The Bad, and The Ugly", "movie", 3.4);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        nowHits.spinDisc();
        classicMovie1.spinDisc();

        nowHits.storeData();
        nowHits.returnData();

    }
}
