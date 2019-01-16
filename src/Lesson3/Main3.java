package Lesson3;

public class Main3 {
    public static void main(String[] args) {

        int a[] = new int[10];

        int index = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                a[index] = i;
                index++;

            }
            if (index == 10) {
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
