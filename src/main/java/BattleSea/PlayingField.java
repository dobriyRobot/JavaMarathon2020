package BattleSea;

public class PlayingField {
    private Badge[][] field;

    public PlayingField(Badge[][] field){
        this.field = field;
    }

    public Badge[][] getField() {
        return field;
    }

    public void setField(Badge[][] field) {
        this.field = field;
    }
}
