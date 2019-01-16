package Lesson4;

public class Main2 {
    public static void main(String[] args) {
        char [] mass1 = {'a','b','c','d'};
        char[] mass2 = {'q','w','e','r'};

        char[] union = new char[8];
        for (int i = 0; i <= 3 ; i++) {
            union[i] = mass1[i];
            union[i + 4] = mass2[i];

        }
        for (int i = 0; i < 8; i++) {
            System.out.println(union[i]);
        }

    }
}
