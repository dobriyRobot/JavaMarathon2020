package BattleSea;

public enum Badge {
    SHIP("\uD83D\uDEE5"), HALO("\uD83D\uDFE6"), HIT("\uD83D\uDFE5"), EMPTY("⬜");

    private String name;

    Badge(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
