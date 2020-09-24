package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] massiv = new int[100];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10000);
        }
        int m1 = 0;
        int m2 = 10000;
        int element = 0;
        int sumElement = 0;

        for (int x : massiv) {
            if (x > m1) {
                m1 = x;
            }
            if (x < m2) {
                m2 = x;
            }
            if (x % 10 == 0) {
                element++;
                sumElement += x;
            }

        }
        //Задания вывести сам массив нет,поэтому не вывожу.
        System.out.println("Наибольший элемент массива " + m1);
        System.out.println("Наименьший элемент массива " + m2);
        System.out.println("Количество элекментов массива, оканчивающихся на 0: " + element);
        System.out.println("Сумма элекментов массива, оканчивающихся на 0:  " + sumElement);
    }
}

