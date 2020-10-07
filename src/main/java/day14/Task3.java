package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> parseFileToObjList = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] arr = line.split(" ");
                parseFileToObjList.add(new Person(arr[0], Integer.parseInt(arr[1])));
                if (Integer.parseInt(arr[1]) < 0) {
                    throw new IOException();
                }
            }
            return parseFileToObjList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
