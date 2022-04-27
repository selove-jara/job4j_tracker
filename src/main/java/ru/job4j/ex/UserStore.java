package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                System.out.println("Здравствуйте, " + user.getUsername());
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден.");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не действительно или имя имеет менее 3 символов");
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Andrey Morozov", false),
                new User("Stas Korobeinikov", true),
        };
        try {
            User user = findUser(users, "Andrey Morozov");
            if (validate(user)) {
                System.out.println(user.getUsername() + " имеет доступ.");
            }
        } catch (UserInvalidException ev) {
            ev.printStackTrace();
        } catch (UserNotFoundException ef) {
            ef.printStackTrace();
        }
    }
}