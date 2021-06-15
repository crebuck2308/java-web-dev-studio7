package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpitcalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(String aDiscType, String aTitle, String aMediaType, double aRuntime) {
        super(aDiscType, aTitle, aMediaType, aRuntime);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");

    }

    @Override
    public void storeData() {
        System.out.println("A DVD can hold a movie with a runtime of less than 4.5 hours");
    }

    @Override
    public void returnData() {
        System.out.println("Insert into a DVD player and enjoy the movie.");

    }


}
