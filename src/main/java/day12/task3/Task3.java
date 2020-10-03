package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Aria", 1990));
        bands.add(new MusicBand("Lin Park", 1998));
        bands.add(new MusicBand("ddt", 1980));
        bands.add(new MusicBand("The Beatles", 1970));
        bands.add(new MusicBand(" Limp Bizkit", 2000));
        bands.add(new MusicBand("Maroon 5", 2008));
        bands.add(new MusicBand("The Prodigy", 2001));
        bands.add(new MusicBand("Rammstein", 2004));
        bands.add(new MusicBand("Lynyrd Skynyrd", 2009));
        bands.add(new MusicBand("YrbanTren", 2015));
        Collections.shuffle(bands);
        System.out.println(bands);
        groupsAfter2000(bands);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        ArrayList<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                groupsAfter2000.add(bands.get(i));
            }
        }
        System.out.println(groupsAfter2000);
        return groupsAfter2000;
    }

}
