package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.action.output.Console;
import ru.job4j.tracker.action.output.Output;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.Validate;

import java.util.Arrays;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Неверный ввод, вы можете выбрать: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    public void showMenu(List<UserAction> actions) {
        out.println("Меню:");
        for (int i = 0; i < actions.size(); i++) {
            out.println(i + ". " + actions.get(i).name());
        }
    }

    public static void main(String[] args) {
        Output output = new Console();
        Input input = new Validate(output, new ru.job4j.tracker.input.Console());
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(new Create(output), new FindAll(output),
                new Replace(output), new Delete(output), new FindById(output),
                new FindByName(output), new Exit(output));
        new StartUI(output).init(input, tracker, actions);
    }
}
