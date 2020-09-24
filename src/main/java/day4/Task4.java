package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] massiv = new int[100];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10000);
        }

        int troika = 0;
        int maxTroika = 0;
        int nachaloTroiky = 0;

        for (int i = 0; i < massiv.length - 2; i++) {
            troika = massiv[i] + massiv[i + 1] + massiv[i + 2];

            if (troika > maxTroika) {
                maxTroika = troika;
                nachaloTroiky = i;
            }
        }
        System.out.println(maxTroika);
        System.out.println(nachaloTroiky);
    }
}
