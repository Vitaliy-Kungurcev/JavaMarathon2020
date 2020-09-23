package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ((1 <= x) && (x <= 4)) {
            System.out.println("Малоэтажный дом");
        } else if ((5 <= x) && (x <= 8)) {
            System.out.println("Среднеэтажный дом");
        } else if (9 <= x) {
            System.out.println("Многоэтажный дом");
        } else if (x <= 0) {
            System.out.println("Ошибка ввода");


        }
    }
}
