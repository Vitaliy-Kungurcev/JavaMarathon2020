package day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Task1{

    public static void main(String arr[]) throws FileNotFoundException
    {
        PrintStream filePrintStream = new PrintStream(new File("C:\\Users\\PC\\Desktop\\test.txt"));

        filePrintStream.println(222);
        filePrintStream.println("Hello world");
        filePrintStream.println(false);
    }
}