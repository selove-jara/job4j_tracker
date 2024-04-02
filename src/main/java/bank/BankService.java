package bank;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BankService {

    private final Map<User, List<Account>> users;

    public BankService(Map<User, List<Account>> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void deleteUser(String passport) {
        users.remove(findByPassport(passport));
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        if (user != null) {
            if (!accounts.contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;

        }
        return users.get(user)
                .stream()
                .filter(account -> requisite.equals(account.getRequisite()))
                .findFirst()
                .orElse(null);
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}