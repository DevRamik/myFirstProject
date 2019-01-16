package Domashka;
//Найти гласные буквы

public class Main3 {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e'};

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == 'a' || arr[i] == 'b' || arr[i] == 'c' || arr[i] == 'd' || arr[i] == 'e') {
                sum++;
            }
            System.out.println(arr[i] + " гласных");
        }
    }
}
