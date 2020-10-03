package day11;

 public class Warehouse {
    private int countOrder = 0;
    private int balance = 0;

    public int getCountOrders() {
        return countOrder;
    }

    public void setCountOrders(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return ("Количество собранных заказов " + countOrder + ", доход от доставленных заказов " + balance);
    }
}
