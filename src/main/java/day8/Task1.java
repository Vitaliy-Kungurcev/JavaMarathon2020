package day8;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("0");
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++)
        {
            sb.append(" ").append(i);
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(sb.toString());
        System.out.println("Время работы первой программы " + timeConsumedMillis);
        System.out.println("Время работы второй программы " + taskString());
    }

    public static long taskString() {
        String taskString = "0";
        long start = System.currentTimeMillis();
        System.out.print(taskString);
        for (int i = 1; i <= 20000; i++)
        {
            taskString = (" " + i);
            System.out.print(taskString);
        }
        System.out.println();
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
