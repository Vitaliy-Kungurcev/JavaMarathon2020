package day11;

public class Picker implements Worker {
    Warehouse warehouse;
    private int salary = 0;


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public void doWork() {
        salary = salary + 80;
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrders() == 1500) {
            salary = salary * 3;

        }
    }
}
