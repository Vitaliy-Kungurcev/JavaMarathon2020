package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() { //возвращает список всех сообщений в “базе данных”.
        return messages;
    }

    public static void showDialog(User u1, User u2) {// этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:
        for (Message message : messages) {
            if ((message.toString().contains(u1.getUsername())) && (message.toString().contains(u2.getUsername()))) {
                System.out.println(message);
            }
        }
    }
}






