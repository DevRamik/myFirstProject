package Lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] massive = new int[7];

        massive[0] = 7;
        massive[1] = 6;
        massive[2] = 5;
        massive[3] = 4;
        massive[4] = 3;
        massive[5] = 2;
        massive[6] = 1;

        int index = 0;
        int value = 7;

        for (int i = 0; i < 7; i++) {
            massive[index] = value;
            index++;
            value--;
            System.out.println(massive[i]);

        }
    }
}
