package org.launchcode;

public abstract class BaseDisc {
   //title, minutesLong
    private String title;
    private int minutesLong;
    private int currentMinutes = 0;

    public BaseDisc(String title, int minutesLong){
        this.title = title;
        this.minutesLong = minutesLong;


    }

    public void stop(int minPlayed){
        if (currentMinutes + minPlayed >= minutesLong){
            currentMinutes = minutesLong;
            System.out.println("You have reached the end of the recording. Please rewind.");
        } else{
            currentMinutes += minPlayed;
            System.out.println("Your recoding is at " + currentMinutes + " minutes out of " + minutesLong + ".");
        }

    }

    public void rewind(){
        currentMinutes = 0;
    }



    public void setCurrentMinutes(int min){
        this.currentMinutes = min;
    }

    public int getCurrentMinutes() {
        return currentMinutes;
    }
    public String getTitle() {
        return title;
    }
    public int getMinutesLong() {
        return minutesLong;
    }
}
