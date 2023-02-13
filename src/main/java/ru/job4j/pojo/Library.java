package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("War and Peace", 1300);
        Book bookTwo = new Book("Clean code", 464);
        Book bookThree = new Book("Harry Potter and the Sorcerer's Stone", 432);
        Book bookFour = new Book("Crime and Punishment", 592);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getNumberOfPages());
        }
        System.out.println();
        books[0] = books[3];
        books[3] = bookOne;
        System.out.println("После перестановки книг:");
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getNumberOfPages());
        }
        System.out.println();
        System.out.println("Вывод книг с именем \"Clean code\":");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getNumberOfPages());
            }
        }
    }
}
