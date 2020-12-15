package day12.task5;

public class MusicArtist {
    private String name;
    private String surName;
    private int age;

    public MusicArtist(String name, String surName, int age){
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surName;
    }

    public String getSurName(){
        return surName;
    }
    public String getName(){
        return name;
    }
}
