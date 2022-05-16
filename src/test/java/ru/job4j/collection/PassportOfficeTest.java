package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addDubl() {
        Citizen citizen = new Citizen("224488", "Petr Arsentev");
        Citizen citizenM = new Citizen("224488", "Andrey Morozov");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizenM);
        assertFalse(office.add(citizenM));
    }
}