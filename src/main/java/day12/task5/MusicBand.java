package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public void printMembers() {
        List<String> groupMembers = new ArrayList<>();
        for(int i = 0; i < members.size(); i ++) {
            groupMembers.add((members.get(i).getName() + " " + members.get(i).getSurName()));
        }
        System.out.println(groupMembers);
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (int i = 0; i < band2.members.size(); i++) {
            band1.members.add(band2.members.get(i));
        }
    }
}
