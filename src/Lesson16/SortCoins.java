package Lesson16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortCoins {

    public static Collection<Coin> sortByMetal(Collection<Coin> coins) {
        ArrayList<Coin> newCoins = new ArrayList<>();
        newCoins.addAll(coins);
        Collections.sort(newCoins, new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                int year1 = o1.getDateOfIssue();
                int year2 = o2.getDateOfIssue();

                if (year1 != year2) {
                    return year1 - year2;
                }

                int nominal1 = o1.getNomenal();
                int nominal2 = o2.getNomenal();
                if (nominal1 != nominal2) {
                    return nominal1 - nominal2;
                }

                int star1 = o1.getStarCount();
                int star2 = o2.getStarCount();
                if (star1 != star2) {
                    return star1 - star2;
                }

                return o1.getMaterial().compareTo(o2.getMaterial());
            }

        });
        return newCoins;
    }

    public static Collection<Coin> sortDa() {
        return null;
    }

}
