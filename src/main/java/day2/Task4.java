package day2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        if (x >= 5) {
            double y = ((pow(x, 2)) - 10) / (x + 7);
            System.out.println(y);
        } else if ((-3 < x) && (x < 5)) {
            double y = (x + 3) * ((pow(x, 2)) - 2);
            System.out.println(y);
        } else {
            double y = 420;
            System.out.println(y);

        }
    }
}

