package technology.src.main.java;

public class Program{
    public static void main(String[] args){
        Laptop laptop = new Laptop("Apple", 2014, "Air");
        System.out.println(laptop.getPowerLevel());
        laptop.playVideo(5.0);
        System.out.println(laptop.getPowerLevel());

        SmartPhone smartPhone = new SmartPhone("Apple", 2012, "Iphone 6");
        System.out.println(smartPhone.getPowerLevel());
        smartPhone.navigate(3.2);
        System.out.println(smartPhone.getPowerLevel());

    }
}