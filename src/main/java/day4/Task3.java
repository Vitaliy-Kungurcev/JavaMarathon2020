package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] massiv = new int[12][8];

        int sravnenie = 0;
        int nomerStroki = 0;

        for (int i = 0; i < massiv.length; i++) {
            int sum = 0;

            for (int j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = random.nextInt(50);
                sum += massiv[i][j];
                if (sum > sravnenie) {
                    sravnenie = sum;
                    nomerStroki = i;
                }

            }
            System.out.println(Arrays.toString(massiv[i]) + " Сумма - " + sum);
        }
        System.out.println();
        System.out.println("Ответ: " + nomerStroki + " индекс строки, сумма чисел в которой максимальна-  " + sravnenie);
    }
}
