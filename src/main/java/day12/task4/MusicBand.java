package day12.task4;
import java.util.List;


public class MusicBand {
    private List<String> members;
    private String name;
    private int year;

    public MusicBand(String name, int year, List<String> members) {
        this.members = members;
        this.name = name;
        this.year = year;
    }

    public List<String> getMembers() {
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

        System.out.println("Участники: "+members.getMembers());
    }

    public String toString() {
        return ("Группа: " + name + ", год основания: " + year + " участники: " + getMembers());
    }
}
