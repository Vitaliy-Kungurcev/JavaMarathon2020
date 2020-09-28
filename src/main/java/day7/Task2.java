package day7;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = new Player();
        player1.setStamina(91);
        Player player2 = new Player();
        player2.setStamina(92);
        Player player3 = new Player();
        player3.setStamina(93);
        Player player4 = new Player();
        player4.setStamina(94);
        Player player5 = new Player();
        player5.setStamina(95);
        Player player6 = new Player();
        player6.setStamina(96);


        while (player1.getStamina() != Player.MIN_STAMINA) {
            player1.run();
        }


        Player.info();
    }
}

class Player {


    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    static int countPlayer;
    static String free;

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;

    }

    public Player() {
        if (countPlayer < 6) {
            Player.countPlayer++;

        }
    }

    public void run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayer--;
        }
    }

    public static void info() {
        if (countPlayer < 6) {
            if (countPlayer == 5) {
                free = " свободное место";
            } else {
                free = " свободных места";
            }

            System.out.println("Команды неполные, еще есть " + (6 - countPlayer) + free);
        } else System.out.println("Мест в командах больше нет");
    }


}

