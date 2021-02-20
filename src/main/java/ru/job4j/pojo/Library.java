package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book first = new Book("Clean code", 464);
        Book second = new Book("My my", 400);
        Book third = new Book("War and peace", 500);
        Book forth = new Book("Romeo and Julieta", 250);

        Book[] lib = new Book[4];
        lib[0] = first;
        lib[1] = second;
        lib[2] = third;
        lib[3] = forth;
        for (int i = 0; i < lib.length; i++) {
            Book code = lib[i];
            System.out.println(code.getName() + " - " + code.getNumberPages());
        }

        Book temp = lib[0];
        lib[0] = lib[3];
        lib[3] = temp;
        for (int i = 0; i < lib.length; i++) {
            Book book = lib[i];
            System.out.println(book.getName() + " - " + book.getNumberPages());
        }

        for (int i = 0; i < lib.length; i++) {
            Book book = lib[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getNumberPages());
            }
        }
    }
}
