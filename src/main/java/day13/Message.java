package day13;
import java.util.Date;

public class Message {
    private User sender;         // отправитель сообщения
    private User receiver;       //получатель сообщения
    private String text;         //текст сообщения
    private Date date;           //дата отправки сообщения

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {// возвращает строковое представление пользователя (имя пользователя).
        return ("FROM: " + getSender() + "\n" +
                "TO: " + getReceiver() + "\n" +
                "ON: " + getDate() + "\n" +
                getText() + "\n");
    }
}
