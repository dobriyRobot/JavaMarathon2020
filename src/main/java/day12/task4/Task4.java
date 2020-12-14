package day12.task4;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Billie Joe Armstrong");
        members1.add("Mike Dirnt");
        members1.add("Tré Cool");

        List<String> members2 = new ArrayList<>();
        members2.add("Michael Kenji Shinoda");
        members2.add("Joseph Hahn");
        members2.add("Bradford Phillip Delson");
        members2.add("Robert Gregory Bourdon");
        members2.add("David Michael Farrell");

        MusicBand band1 = new MusicBand("GreenDay", 1987, members1);
        MusicBand band2 = new MusicBand("LinkinPark", 1996, members2);

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
