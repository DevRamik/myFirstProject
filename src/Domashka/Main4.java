package Domashka;
//Найти наименьший общий знаменатель

public class Main4 {
    public static void main(String[] args) {
        int znam1 = 3;
        int znam2 = 9;

        for (int i = 1; i < znam1 * znam2; i++) {
            if (i % znam1 == 0 && i % znam2 == 0) {
                System.out.println("Наименьнший знаменатель " + i);
                break;
            }
        }
    }
}
