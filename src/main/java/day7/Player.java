package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int theStamina) {
        if (countPlayers > 6) {
            System.out.println("В командах нет свободных мест");
            return;
        } else {
            this.stamina = theStamina;
            countPlayers++;
        }
    }

    void setStamina(int theStamina) {
        this.stamina = theStamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("\nВыносливость " + stamina + ". Игрок уходит с поля");
        } else {
            this.stamina = stamina - 1;
            System.out.print("Игрок бежит / ");
        }
    }

    public void info() {
        if (countPlayers < 5) {
            System.out.println("Команды не полные. На поле еще есть " + (5 - countPlayers) + " мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
