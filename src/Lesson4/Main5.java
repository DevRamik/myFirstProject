package Lesson4;

public class Main5 {
    public static void main(String[] args) {

        //Выводит на экран числа от 0 до 10, кроме 3, 5, 7
        int i = 0;
        while (i < 11) {
            if (i != 3 && i != 5 && i != 7){
                System.out.println(i);
            }
            i++;
        }

    }

}

