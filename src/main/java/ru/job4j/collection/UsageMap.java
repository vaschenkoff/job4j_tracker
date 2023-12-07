package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("vaschenkoff@mail.ru", "Andrey Ilich Vaschenkov");
        map.put("vaschenkoff@mail.ru", "Pavel Sergeevich Fedorov");
        map.put("pushkin@mail.ru", "Alexander Sergeevich Pushkin");
        map.put("gogol@mail.ru", "Nikolay Vasilevich Gogol");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
