package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("MyFile");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != 10) {
                System.out.println("Некорректный входной файл");
                throw new IOException();
            }
            int sum = 0;
            for (String number : numbers) {
                int k = Integer.parseInt(number);
                sum += k;
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
