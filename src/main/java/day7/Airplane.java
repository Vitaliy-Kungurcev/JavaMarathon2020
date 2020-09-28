package day7;

public class Airplane{
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    String manufacturer;
    int yearOfManufacture;
    int lenght;
    int weight;
    int amountOfFuel = 0;

    public Airplane(String manufacturer, int yearOfManufacture, int lenght, int weight) {
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.lenght = lenght;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + getYearOfManufacture() + ", длина: " + getLenght() + ", вес: " + weight + ", количества топлива в баке: " + amountOfFuel);
    }

    public int fillUp(int liters) {
        amountOfFuel = amountOfFuel + liters;
        return amountOfFuel;
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {
        if (plane1.getLenght() > plane2.getLenght()) {
            System.out.println("Первый самолет длиннее");
        } else if (plane1.getLenght() < plane2.getLenght()) {
            System.out.println("Второй самолет длиннее");
        }
    else  System.out.println("Длины самолетов равны");
}}
