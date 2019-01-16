package Lesson10;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Monkey monke1 = new Monkey();
        Pinguin pinguin1 = new Pinguin();
        Lion lion2 = new Lion();
        Monkey monkey2 = new Monkey();
        Pinguin pinguin2 = new Pinguin();

        pinguin1.print();
        pinguin2.print();
        lion1.print();
        lion2.print();
        monke1.print();
        monkey2.print();

        pinguin1.setName("Vasya");
        pinguin1.setCost(12000);
        pinguin2.setName("Vasya");
        pinguin2.setCost(12000);

        System.out.println(pinguin2.equals(pinguin1));
        System.out.println(pinguin1);
    }
}
