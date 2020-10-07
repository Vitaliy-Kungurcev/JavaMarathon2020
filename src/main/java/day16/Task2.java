package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        File fileWriter1 = new File("D:\\\\Programs\\\\JavaMarathon20202\\\\src\\\\main\\\\resources\\\\file1.txt");
        File fileWriter2 = new File("D:\\\\Programs\\\\JavaMarathon20202\\\\src\\\\main\\\\resources\\\\file2.txt");
        try {
            PrintWriter pw1 = new PrintWriter(fileWriter1);
            PrintWriter pw2 = new PrintWriter(fileWriter2);
            Scanner sc = new Scanner(fileWriter1);
            int[] massivWriter1 = new int[1000];
            for (int i = 0; i < massivWriter1.length; i++) {
                pw1.print(random.nextInt(100) + " ");
            }
            pw1.close();
            String line = sc.nextLine();
            int sum = 0;
            int count = 0;
            String[] list = line.split(" ");
            for (String s : list) {
                sum += Integer.parseInt(s);
                count++;
                if (count == 20) {
                    pw2.print((double) sum / count + " ");
                    count = 0;
                }
            }
            pw2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        printResult(fileWriter2);
    }

    public static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            double sum = 0;
            String[] list = line.split(" ");
            for (String s : list) {
                sum += Double.parseDouble(s);
            }
            System.out.print((int) sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
