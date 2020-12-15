package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers(){
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }

    public static void transferMembers(MusicBand band1, MusicBand band2){
        for(int i = 0; i < band2.members.size(); i++){
            band1.members.add(band2.members.get(i));
        }
        band2.members.clear();
    }
}
