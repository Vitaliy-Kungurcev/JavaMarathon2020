package day12.task5;

import java.util.List;


public class MusicBand {
    private List<MusicArtist> members;
    private String name;
    private int year;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.members = members;
        this.name = name;
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand bands1, MusicBand bands2) {
        for (int i = 0; i < bands1.getMembers().size(); i++) {
            bands2.getMembers().add(bands1.getMembers().get(i));
            bands1.getMembers().remove(i);
            i--;
        }
    }

    public static void printMembers(MusicBand members) {
        System.out.println("Участники: " + members.getMembers());
    }

    public String toString() {
        return ("Группа: " + name + ", год основания: " + year + " участники: " + getMembers());
    }
}
