package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike();
        car.setYearOfManufacture(2000);
        car.setModel("Subaru");
        car.setColor("Красный");
        car.info();
        System.out.println("Возраст автомобиля: " + car.yearDifference(2020) + " лет.");
        motorbike.info();
        System.out.println("Возраст мотоцикла: " + motorbike.yearDifference(2020) + " года. ");

    }


}
