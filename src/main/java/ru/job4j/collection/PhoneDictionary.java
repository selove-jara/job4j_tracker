package ru.job4j.collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> searchName = p -> p.getName().contains(key);
        Predicate<Person> searchSurname = p -> p.getSurname().contains(key);
        Predicate<Person> searchPhone = p -> p.getPhone().contains(key);
        Predicate<Person> searchAddress = p -> p.getAddress().contains(key);
        Predicate<Person> combine = searchName.or(searchSurname)
                .or(searchPhone).or(searchAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
