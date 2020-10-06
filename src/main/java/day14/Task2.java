package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> peopleList = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                peopleList.add(line);
            }
            for (int i = 0; i < peopleList.size(); i++) {
                String[] people = peopleList.get(i).split(" ");

                if (people[1].contains("-")) {
                    System.out.println("Некорректный входной файл");
                    throw new IOException();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return peopleList;
    }
}
