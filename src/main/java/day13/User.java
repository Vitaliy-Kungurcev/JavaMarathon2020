package day13;

import java.util.ArrayList;
import java.util.List;


public class User {

    private String username;
    private List<User> subscriptions; //  В этом списке должны храниться те пользователи, на которых подписан пользователь.

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {  //подписывает пользователя на пользователя user
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {  //возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) { // возвращает True, если пользователь user является другом и False, если пользователь user не является другом. Подумайте, что такое дружба в контексте соц. сетей.
        return (this.isSubscribed(user)) && (user.isSubscribed(this));
    }

    public void sendMessage(User user, String text) { // отправляет сообщение с текстом text пользователю user. Здесь должен использоваться статический метод из MessageDatabase.
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {// возвращает строковое представление пользователя (имя пользователя).
        return (username);
    }
}
