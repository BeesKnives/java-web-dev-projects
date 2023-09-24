package technology.src.main.java;

public abstract class Computer {
    private String company;
    private int year;
    private Double powerLevel = 100.0;

    public Computer(String company, int year){
        this.company = company;
        this.year = year;
    }

    public String getCompany() {return company;}
    public int getYear() {return year;}
    public Double getPowerLevel() {return powerLevel;}

    public void setPowerLevel(Double powerLevel) {this.powerLevel = powerLevel;}


    public void useComputer(Double powerUsed){

        this.powerLevel = this.powerLevel - powerUsed;
    }

}