package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Aero", 2015, 49, 12000);
        Airplane plane2 = new Airplane("Utair", 2012, 50, 14000);
        Airplane.compareAirplanes(plane1,plane2);


    }
}