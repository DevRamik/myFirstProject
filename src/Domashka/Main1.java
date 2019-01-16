package Domashka;

//Записать в массив числа, которые делятся на 4 без остатка
public class Main1 {
    public static void main(String[] args) {
        int[] arr = new int[7]; //Создание нового массива
        int x = 4;
        for (int i = 0; i < 7; i++) {
            arr[i] = x;
            x = x + 4;
            System.out.println(arr[i]);
        }

    }
}
