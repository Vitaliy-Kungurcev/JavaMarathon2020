package day8;

public class Airplane {

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

    public String toString() {
        return ("Изготовитель: " + manufacturer + ", год выпуска: " + getYearOfManufacture() + ", длина: " + getLenght() + ", вес: " + weight + ", количество топлива в баке: " + amountOfFuel);
    }

    public int fillUp(int liters) {
        amountOfFuel = amountOfFuel + liters;
        return amountOfFuel;
    }
}

