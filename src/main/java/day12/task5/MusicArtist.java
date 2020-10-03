package day12.task5;

public class MusicArtist {
    String nameArtist;
    int age;

    public MusicArtist(String nameArtist, int age) {
        this.nameArtist = nameArtist;
        this.age = age;
    }

    public String toString() {
        return ("Участник: " + nameArtist + ", возраст: " + age);
    }
}
