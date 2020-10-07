package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("MyFile");
        printResult(file);
    }
    public static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            int sum = 0;
            String[] list = line.split(" ");
            for (int i = 0; i < list.length; i++) {
                sum += Integer.parseInt(list[i]);
            }
            System.out.printf((double) sum / list.length + " --> " + "%.3f", (double) sum / list.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
