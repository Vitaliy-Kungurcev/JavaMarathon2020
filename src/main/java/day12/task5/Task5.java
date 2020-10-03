package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        List<MusicArtist> members1 = new ArrayList<>();
        ArrayList<MusicArtist> members2 = new ArrayList<>();
        bands.add(new MusicBand("Aria", 1990, members1));
        bands.add(new MusicBand("Lin Park", 1998, members2));
        members1.add(new MusicArtist("Иван Иванов", 35));
        members1.add(new MusicArtist("Петр Петров", 88));
        members1.add(new MusicArtist("Паша Пашин", 44));
        members2.add(new MusicArtist("Олег Олегов", 55));
        members2.add(new MusicArtist("Костя Костин", 22));
        MusicBand.transferMembers(bands.get(0), bands.get(1));
        MusicBand.printMembers(bands.get(0));
        MusicBand.printMembers(bands.get(1));
        System.out.println(bands.get(0));
        System.out.println(bands.get(1));
    }
}
