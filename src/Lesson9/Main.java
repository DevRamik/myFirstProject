package Lesson9;

public class Main {
    public static void main(String[] args) {
        Book pushkin = new Book();

        Book esenin = new Book("Esenin","Qwerty", 1959);

        Book book1 = new Book(21, "Vishya", "Chekhov", 1900, "Soft", 34, 24, 25);

        book1.setCountStr(25);
        pushkin.print();
        esenin.print();
        book1.print();
    }
}

