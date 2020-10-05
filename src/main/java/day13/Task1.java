package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Василий");
        User user2 = new User("Евгений");
        User user3 = new User("Антон");
        user1.sendMessage(user2, "Сообщения от User1 к User2");
        user1.sendMessage(user2, "Сообщения от User1 к User2");
        user2.sendMessage(user1, "Сообщения от User2 к User1");
        user2.sendMessage(user1, "Сообщения от User2 к User1");
        user2.sendMessage(user1, "Сообщения от User2 к User1");
        user3.sendMessage(user1, "Сообщения от User3 к User1");
        user3.sendMessage(user1, "Сообщения от User3 к User1");
        user3.sendMessage(user1, "Сообщения от User3 к User1");
        user1.sendMessage(user3, "Сообщения от User1 к User3");
        user1.sendMessage(user3, "Сообщения от User1 к User3");
        user1.sendMessage(user3, "Сообщения от User1 к User3");
        user3.sendMessage(user1, "Сообщения от User3 к User1");
        MessageDatabase.showDialog(user1, user3);
    }
}
