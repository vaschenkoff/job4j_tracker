package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            } else {
                throw new ElementNotFoundException("Index is not found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] arr = {"privet", "kak dela"};
        try {
            indexOf(arr, "privet");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
