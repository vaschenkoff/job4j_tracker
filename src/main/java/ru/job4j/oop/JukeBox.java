package ru.job4j.oop;

public class JukeBox {
    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже.");
                break;
                case 2:
                System.out.println("Спокойной ночи.");
                break;
            default:
                System.out.println("Песня не найдена.");
                break;
        }
    }

    public static void main(String[] args) {
        JukeBox song = new JukeBox();
        song.music(2);
    }
}
