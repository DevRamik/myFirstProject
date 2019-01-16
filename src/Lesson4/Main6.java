package Lesson4;

public class Main6 {
    public static void main(String[] args) {
        char[] mass1 = {'a','b','c','d'};

        char[] mass2 = new char[4];

        int index1 = 3;
        for (int i = 0; i <= 3 ; i++) {
            mass2[i] = mass1[index1];
            index1--;
        }
        for (int i = 0; i <= 3 ; i++) {
            System.out.println(mass2[i]);
        }
    }
}
