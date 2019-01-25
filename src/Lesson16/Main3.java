package Lesson16;

import java.util.Collection;
import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {



        Coin coin = new Coin(12, "Silver", 1900, 50);
        Coin coin2 = new Coin(13, "Gold", 1600, 45);
        Coin coin3 = new Coin(14, "Bronze", 1800, 30);
        Coin coin4 = new Coin(15, "Platium", 1976, 20);
        Coin coin5 = new Coin(62, "Zink", 1970, 21);
        Coin coin6 = new Coin(12, "Silver", 1900, 50);

        HashSet<Coin> coins = new HashSet<>();
        coins.add(coin);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        Collection<Coin> result = SortCoins.sortDa();

    }
}
