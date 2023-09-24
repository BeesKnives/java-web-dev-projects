package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String title, int minutesLong){
        super(title, minutesLong);
    }
    // TODO: Implement your custom interface.

    @Override
    public void playMedia(){
        System.out.println("Music begins to play");
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
