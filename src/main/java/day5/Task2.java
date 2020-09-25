package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike();
        System.out.println("Мой мотоцикл модели " + motorbike.getModel() + ", " + motorbike.getYearOfManufacture() + " года выпуска,цвет " + motorbike.getColor());
    }
}

class Motorbike {
    int yearOfManufacture;
    String color;
    String model;

    public Motorbike() {
        this.yearOfManufacture = 2018;
        this.color = "Красный";
        this.model = "Honda";
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }


}


