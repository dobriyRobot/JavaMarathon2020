package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("GreenDay", 1987));
        musicBandList.add(new MusicBand("LinkinPark", 1996));
        musicBandList.add(new MusicBand("RedHotChiliPeppers", 1983));
        musicBandList.add(new MusicBand("30SecondsToMars", 2010));
        musicBandList.add(new MusicBand("ThreeDaysGrace", 1999));
        musicBandList.add(new MusicBand("FooFighters", 2020));
        musicBandList.add(new MusicBand("Gorillaz", 1992));
        musicBandList.add(new MusicBand("Maroon5", 2001));
        musicBandList.add(new MusicBand("Blink-182", 2000));
        musicBandList.add(new MusicBand("Offspring", 1987));
        musicBandList.add(new MusicBand("NOFX", 1978));
        System.out.println(musicBandList);
        System.out.println(groupsAfter2000(musicBandList));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> newMusicBandList = new ArrayList<>();
        for(MusicBand band : bands){
            if (band.getYear() >= 2000){
                newMusicBandList.add(band);
            }
        }
        return newMusicBandList;
    }
}
