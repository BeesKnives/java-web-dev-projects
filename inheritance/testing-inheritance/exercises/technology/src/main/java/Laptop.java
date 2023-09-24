package technology.src.main.java;

public class Laptop extends Computer{
    private String model;

    public Laptop(String company, int year, String model){
        super(company, year);
        this.model = model;
    }

    public void playVideo(Double minutes){
        useComputer(minutes*2);
    }



}