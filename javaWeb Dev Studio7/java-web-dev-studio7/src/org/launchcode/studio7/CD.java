package org.launchcode.studio7;

public class CD extends BaseDisc implements OpitcalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String aDiscType, String aTitle, String aMediaType, double aRuntime) {
        super(aDiscType, aTitle, aMediaType, aRuntime);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    @Override
    public void storeData() {
        System.out.println("A CD can store up to 30 songs.");

    }

    @Override
    public void returnData() {
        System.out.println("Put this into a CD-player to hear the music.");

    }


}
