package ru.job4j.bank;

import java.util.*;

public class BankService {

    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(u -> u.getRequisite().equals(requisite))
                .findFirst());
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> account = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> account1 = findByRequisite(destPassport, destRequisite);
        if (account.isPresent() && account1.isPresent() && amount <= account.get().getBalance()) {
            account.get().setBalance(account.get().getBalance() - amount);
            account1.get().setBalance(account1.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}