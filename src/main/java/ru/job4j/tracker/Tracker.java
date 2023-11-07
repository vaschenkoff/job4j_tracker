package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        int len = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item != null) {
                result[len] = item;
                len++;
            }
        }
        return Arrays.copyOf(result, len);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int len = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                result[len++] = item;
            }
        }
        return Arrays.copyOf(result, len);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
            
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }
}