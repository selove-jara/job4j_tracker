package ru.job4j.tracker;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new EditAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                         + "0. Edit" + ln
                         + "1. Exit Program" + ln
                         + "=== Edit item ===" + ln
                         + "Заявка изменена успешно." + ln
                         + "Menu." + ln
                         + "0. Edit" + ln
                         + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindAllItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("FindAll"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ShowAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Show" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all items ===" + ln
                        +  one + ln
                        + "Menu." + ln
                        + "0. Show" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindByNameItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("FindByName"));
        Input in = new StubInput(
                new String[]{"0", one.getName(), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new SearchNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ===" + ln
                        +  one + ln
                        + "Menu." + ln
                        + "0. Find by name" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenFindByIdItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("FindById"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new SearchAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find item by id ===" + ln
                        +  one + ln
                        + "Menu." + ln
                        + "0. Find by id" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"9", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                        "Menu." + ln
                                + "0. Exit Program" + ln
                                + "Wrong input, you can select: 0 - 0" + ln
                                + "Menu." + ln
                                + "0. Exit Program" + ln
                )
        );
    }
}