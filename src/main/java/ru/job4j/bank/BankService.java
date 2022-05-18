package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской системы
 * @author Andrey Morozov
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа Map
     */

    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод для добавления пользователя, используя
     * один параметр - объект
     * @param user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод для добавление нового счета
     * @param passport поиск пользователя  по парспорту
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод для поиска пользователя по паспорту
     * @param passport используя поле, для поиска
     * @return возращает поользователя, если пользователь найден, иначе null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод для поиска пользователя по  реквизитам
     * @param passport используем для поиска пользователя по паспорту
     * @param requisite ищем у этого пользователя счет по реквизитам
     * @return возращает счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод для перевода денег с одного счета на другой
     * @param srcPassport поиск по паспорту пользователя
     * @param destPassport поиск по паспорту другого пользователя
     * @param amount сумма которую хотите перевести
     * @return возращает исполнено или нет(true  and false)
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account account1 = findByRequisite(destPassport, destRequisite);
        if (account != null && account1 != null && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            account1.setBalance(account1.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}