package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Neo");
        User user2 = new User("Morpheus");
        User user3 = new User("Trinity");

        user1.sendMessage(user2, "Привет " + user2);
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Все хорошо!");
        user2.sendMessage(user1, "Как сам? " + user1);
        user2.sendMessage(user1, "Что делаешь?");

        user3.sendMessage(user1, "Здорова " + user1);
        user3.sendMessage(user1, "Давай сгоняем в кино");
        user3.sendMessage(user1, "затра");

        user1.sendMessage(user3, "Привет " + user3);
        user1.sendMessage(user3, "завтра не могу");
        user1.sendMessage(user3, "занят");

        user3.sendMessage(user1, "Ну как хочешь");

        MessageDatabase.showDialog(user1, user2);
    }
}
