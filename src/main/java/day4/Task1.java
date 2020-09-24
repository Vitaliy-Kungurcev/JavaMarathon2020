package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int x = sc.nextInt();

        int[] massiv = new int[x];
        for (int i = 0; i < x; i++) {
            massiv[i] = random.nextInt(11);
        }

        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int sum = 0;

        for (int k : massiv) {
            sum += k;

            if (k > 8) {
                i++;
            }
            if (k == 1) {
                i2++;
            }
            if (k % 2 == 0) {
                i3++;
            }
            if (k % 2 != 0) {
                i4++;
            }

        }
        System.out.println(Arrays.toString(massiv));
        System.out.println("Длина массива: " + massiv.length);
        System.out.println("Количество чисел больше 8: " + i);
        System.out.println("Количество чисел равных 1: " + i2);
        System.out.println("Количество четных чисел: " + i3);
        System.out.println("Количество нечетных чисел: " + i4);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}

