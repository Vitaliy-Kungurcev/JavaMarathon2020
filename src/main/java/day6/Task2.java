public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Aeroflot", 2015, 45, 12000);
        plane.setYearOfManufacture(2017);
        plane.setLenght(60);
        plane.fillUp(150);
        plane.fillUp(220);
        plane.info();
    }

    public static class Plane {
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

        public Plane(String manufacturer, int yearOfManufacture, int lenght, int weight) {
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
    }


}