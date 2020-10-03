package day11;

public class Courier implements Worker {
    Warehouse warehouse;
    private int salary;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() == 1000000) {
            salary = salary * 2;

        }
    }
}
