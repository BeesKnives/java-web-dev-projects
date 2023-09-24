package technology.src.main.java;



public class SmartPhone extends Computer {
    private String phoneVersion;

    public SmartPhone(String company, int year, String version){
        super(company, year);
        this.phoneVersion = version;

    }

    public void navigate(Double miles){

        useComputer(miles*5);
    }

}