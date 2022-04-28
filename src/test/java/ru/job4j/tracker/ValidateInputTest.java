package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenMultipleInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "2", "3", "4", "5"}
        );
        ValidateInput input1 = new ValidateInput(out, in);
        int selected1 = input1.askInt("Enter menu:");
        assertThat(selected1, is(1));
        ValidateInput input2 = new ValidateInput(out, in);
        int selected2 = input2.askInt("Enter menu:");
        assertThat(selected2, is(2));
        ValidateInput input3 = new ValidateInput(out, in);
        int selected3 = input3.askInt("Enter menu:");
        assertThat(selected3, is(3));
        ValidateInput input4 = new ValidateInput(out, in);
        int selected4 = input4.askInt("Enter menu:");
        assertThat(selected4, is(4));
        ValidateInput input5 = new ValidateInput(out, in);
        int selected5 = input5.askInt("Enter menu:");
        assertThat(selected5, is(5));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
    }
}