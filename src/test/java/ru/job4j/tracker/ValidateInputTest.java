package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output out = new StubOutput();
        List<String> answers = new ArrayList<>();
        answers.add("one");
        answers.add("1");
        Input in = new MockInput(answers);
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output out = new StubOutput();
        List<String> answers = new ArrayList<>();
        answers.add("3");
        Input in = new MockInput(answers);
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(3);
    }

    @Test
    void whenSeveralValidInput() {
        Output out = new StubOutput();
        List<String> answers = new ArrayList<>();
        answers.add("1");
        answers.add("3");
        answers.add("6");
        answers.add("9");
        answers.add("0");
        Input in = new MockInput(answers);
        ValidateInput input = new ValidateInput(out, in);
        int selected1 = input.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(1);
        int selected3 = input.askInt("Enter menu:");
        assertThat(selected3).isEqualTo(3);
        int selected6 = input.askInt("Enter menu:");
        assertThat(selected6).isEqualTo(6);
        int selected9 = input.askInt("Enter menu:");
        assertThat(selected9).isEqualTo(9);
        int selected0 = input.askInt("Enter menu:");
        assertThat(selected0).isEqualTo(0);
    }

    @Test
    void whenNegativeInput() {
        Output out = new StubOutput();
        List<String> answers = new ArrayList<>();
        answers.add("-1");
        Input in = new MockInput(answers);
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);

    }
}