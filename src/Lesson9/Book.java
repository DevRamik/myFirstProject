package Lesson9;

public class Book {
    private int countStr;
    private String name;
    private String author;
    private int year;
    private String pereplet;
    private int width;
    private int height;
    private int length;

    public Book() {

    }

    public Book(String authorBook, String nameBook, int yearBook) {
        author = authorBook;
        name = nameBook;
        year = yearBook;
    }

    public Book(int countStrBook, String nameBook, String authorBook, int yearBook, String perepletBook, int widthBook, int heightBook, int lengthBook) {
        countStrBook = 100;
        nameBook = "Visnheviy Sad";
        authorBook = "Esenin";
        yearBook = 1988;
        perepletBook = "soft";
        widthBook = 50;
        heightBook = 50;
        lengthBook = 50;
    }

    public void setCountStr(int newCountStr) {
        countStr = newCountStr;
    }

    public int getCountStr() {
        return countStr;
    }

    public void print() {
        System.out.println("Книга: Автор - " + author + " Название - " + name + " Страницы - " + countStr);
    }
}
