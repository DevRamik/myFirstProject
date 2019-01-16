package Lesson12.magazine;

public class Filter {
    public static void printCheapestTovar(Tovar tovar1, Tovar tovar2) {
        if (tovar1.getPrice() < tovar2.getPrice()) {
            System.out.println("Самый дешевый товар: " + tovar1);
        } else {
            System.out.println("Самый дорогой товар : " + tovar2);
        }
    }
}
