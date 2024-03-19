package collection;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int result = name.compareTo(o.name);
        return result == 0 ? Integer.compare(age, o.age) : result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Integer first = 1;
        Integer second = 2;
        int result = first.compareTo(second);
        System.out.println(result);
        System.out.println();
        String petr = "Petr";
        String ivan = "Ivan";
        int resultString = petr.compareTo(ivan);
        System.out.println(resultString);
    }
}