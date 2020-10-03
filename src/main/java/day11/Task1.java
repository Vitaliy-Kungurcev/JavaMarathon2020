package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        Picker picker = new Picker(warehouse1);
        Picker picker2 = new Picker(warehouse2);
        Courier courier = new Courier(warehouse1);
        Courier courier2 = new Courier(warehouse2);

        while (true) {
            picker.doWork();
            picker.bonus();
            courier.doWork();
            courier.bonus();
            if (warehouse1.getCountOrders() == 1500) {
                break;
            }
        }
        picker2.doWork();
        courier2.doWork();
        picker2.doWork();
        courier2.doWork();
        System.out.println(warehouse1 + ". Зарплата сборщика: " + picker.getSalary() + ". Зарплата курьера: " + courier.getSalary());
        System.out.println(warehouse2 + ". Зарплата второго сборщика: " + picker2.getSalary() + ". Зарплата второго курьера: " + courier2.getSalary());
    }
}





