package day6;

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

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int setYear) {
        int yearDiff = setYear - yearOfManufacture;
        return yearDiff;
    }
}


