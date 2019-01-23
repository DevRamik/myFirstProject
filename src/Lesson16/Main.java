package Lesson16;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin(12, "Silver", 1900, 50);
        Coin coin2 = new Coin(13, "Gold", 1600, 45);
        Coin coin3 = new Coin(14, "Bronze", 1800, 30);
        Coin coin4 = new Coin(15, "Platium", 1976, 20);
        Coin coin5 = new Coin(62, "Zink", 1970, 21);
        Coin coin6 = new Coin(12, "Silver", 1900, 50);


        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Iterator<Coin> coinIterator = coins.iterator(); coinIterator.hasNext(); ) {
            System.out.println(coinIterator.next());
        }

        System.out.println("-------------------------------");

        TreeSet<Coin> coins2 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {

                    int year1 = o1.getDateOfIssue();
                    int year2 = o2.getDateOfIssue();

                    if (year1 != year2) {
                        return year2 - year1;
                    }

                    int nominal1 = o1.getNomenal();
                    int nominal2 = o2.getNomenal();
                    if (nominal1 != nominal2) {
                        return nominal2 - nominal1;
                    }

                    int star1 = o1.getStarCount();
                    int star2 = o2.getStarCount();
                    if (star1 != star2) {
                        return star2 - star1;
                    }

                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
        });
        coins2.add(coin);
        coins2.add(coin2);
        coins2.add(coin3);
        coins2.add(coin4);
        coins2.add(coin5);
        coins2.add(coin6);

        for (Iterator<Coin> coinIterator = coins2.iterator(); coinIterator.hasNext(); ) {
            System.out.println(coinIterator.next());
        }
    }
}
