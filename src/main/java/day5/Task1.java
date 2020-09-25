package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfManufacture(2000);
        car.setModel("Subaru");
        car.setColor("Красный");

        System.out.println("Автомобиль марки " + car.getModel() + ", " + car.getYearOfManufacture() + " года выпуска. Цвет:" + car.getColor() + ".");
    }
}

class Car {
    int yearOfManufacture;
    String color;
    String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }


}


