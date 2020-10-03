package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        List<String> members1 = new ArrayList<>();
        ArrayList<String> members2 = new ArrayList<>();
        bands.add(new MusicBand("Aria", 1990, members1));
        bands.add(new MusicBand("Lin Park", 1998, members2));
        members1.add("Иван Иванов");
        members1.add("Петр Петров");
        members1.add("Паша Пашин");
        members2.add("Олег Олегов");
        members2.add("Костя Костин");
        MusicBand.transferMembers(bands.get(0), bands.get(1));
        MusicBand.printMembers(bands.get(0));
        MusicBand.printMembers(bands.get(1));
        System.out.println(bands.get(0));
        System.out.println(bands.get(1));
    }
}
