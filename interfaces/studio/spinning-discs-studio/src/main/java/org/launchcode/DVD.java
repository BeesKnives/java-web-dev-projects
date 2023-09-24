package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String title, int minutesLong){
        super(title, minutesLong);
    }
    // TODO: Implement your custom interface.

   @Override
    public void playMedia(){
        System.out.println("The show begins to play");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
