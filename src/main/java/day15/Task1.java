package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileRead = new File("D:\\Programs\\JavaMarathon20202\\src\\main\\resources\\shoes.csv");
        File fileWrite = new File("D:\\Programs\\JavaMarathon20202\\src\\main\\resources\\missing_shoes.txt");
        PrintWriter pw = new PrintWriter(fileWrite);
        Scanner sc = new Scanner(fileRead);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(";");
            if (Integer.parseInt(arr[2]) == 0) {
                pw.println(line);
            }
        }
        pw.close();
    }
}

