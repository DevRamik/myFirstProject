package Domashka;
//Поместить первое число первого массива и поместить его назад

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 3, 9};
        int[] arr1 = new int[5];

        for (int i = 0; i < 4; i++) {
            arr1[i] = arr[i + 1];

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr1[i]);
        }
    }
}
