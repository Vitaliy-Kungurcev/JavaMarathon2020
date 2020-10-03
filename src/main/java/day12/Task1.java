package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> brand = new ArrayList<>();
        brand.add("Honda");
        brand.add("Toyota");
        brand.add("Subaru");
        brand.add("ВАЗ");
        brand.add("УАЗ");
        brand.add(2,"BMW");
        brand.remove(0);
        System.out.println(brand);
    }
}
