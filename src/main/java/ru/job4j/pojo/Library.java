package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 500);
        Book book2 = new Book("The Lord of The Rings", 1500);
        Book book3 = new Book("Clean Code", 321);
        Book book4 = new Book("The man and the sea", 435);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getPages() + " pages.");
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("-----");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getPages() + " pages.");
        }
        System.out.println("-----");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean Code")) {
                System.out.println(bk.getName() + " " + bk.getPages() + " pages.");
            }
        }
    }
}
