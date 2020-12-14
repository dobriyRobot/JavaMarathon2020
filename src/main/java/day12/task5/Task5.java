package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtistList1 = new ArrayList<>();
        musicArtistList1.add(new MusicArtist("Billie", "Joe Armstrong", 34));
        musicArtistList1.add(new MusicArtist("Mike", "Dirnt", 25));
        musicArtistList1.add(new MusicArtist("Dirnt", "Dirnt", 36));

        List<MusicArtist> musicArtistList2 = new ArrayList<>();
        musicArtistList2.add(new MusicArtist("Michael", "Kenji Shinoda", 19));
        musicArtistList2.add(new MusicArtist("Joseph", "Joseph", 33));
        musicArtistList2.add(new MusicArtist("Bradford", "Phillip Delson", 23));
        musicArtistList2.add(new MusicArtist("Robert", "Gregory Bourdon", 28));
        musicArtistList2.add(new MusicArtist("David", "Michael Farrell", 30));


        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("GreenDay", 1987, musicArtistList1));
        musicBandList.add(new MusicBand("LinkinPark", 1996, musicArtistList2));

        for(int i = 0; i < musicBandList.size(); i ++) {
            musicBandList.get(i).printMembers();
        }

        MusicBand.transferMembers(musicBandList.get(0), musicBandList.get(1));

        for(int i = 0; i < musicBandList.size(); i ++) {
            musicBandList.get(i).printMembers();
        }

    }
}
