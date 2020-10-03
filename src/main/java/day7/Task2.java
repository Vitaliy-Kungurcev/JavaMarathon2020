    package day7;

    import java.util.Random;

    public class Task2 {
        public static void main(String[] args) {
            Random random = new Random();

            Player player1 = new Player(91);

            Player player2 = new Player(95);

            Player player3 = new Player(93);

            Player player4 = new Player(97);

            Player player5 = new Player(98);

            Player player6 = new Player(99);


            while (player1.getStamina() != Player.getMinStamina()) {
                player1.run();
            }


            Player.info();
        }
    }

    class Player {
        private int stamina;
        private static final int MAX_STAMINA = 100;
        private static final int MIN_STAMINA = 0;
        private static int countPlayer;
        static String free;

        public void setStamina(int stamina) {
            this.stamina = stamina;
        }

        public int getStamina() {
            return stamina;
        }

        public static int getMinStamina() {
            return MIN_STAMINA;
        }

        public Player(int stamina) {
            this.stamina = stamina;
            if (countPlayer < 6) {
                countPlayer++;
            }
        }

        public void run() {
            if (stamina == 0) {
                return;
            }
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

