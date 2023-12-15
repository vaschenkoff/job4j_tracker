package ru.job4j.tracker.input;

import java.util.List;

public class Mock implements Input {
    private List<String> answers;
    private int position = 0;

    public Mock(List<String> answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers.get(position++);
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
