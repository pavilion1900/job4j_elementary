package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student first = new Student();
        first.setName("Ivan");
        first.setSurname("Ivanov");
        first.setPatronymic("Ivanovich");
        first.setGroup("IT-1");
        first.setDateReceipt("25.09.2020");
        System.out.println("Student first: " + first.getName() + " "
                + first.getSurname() + " " + first.getPatronymic() + ", group "
                + first.getGroup() + ", receipt date " + first.getDateReceipt());
    }
}
