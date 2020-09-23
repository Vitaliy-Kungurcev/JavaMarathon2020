package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a == b) || (a > b)) {
            System.out.print("Некорректный ввод");
        }
        int i = a + 1;
        while (i < b - 1) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
