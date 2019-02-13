package Lesson17;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       /* HashMap<String, Integer> rating = new HashMap<>();
        rating.put("Arsenal", 5);
        rating.put("Chelsy", 3);
        rating.put("Spartak", 1);
        rating.put("Zenit", 4);

        System.out.println(rating.get("Spartak"));*/

        Rating rating = new Rating();
        rating.addPoint("Arsenal", 8);
        rating.addPoint("Arsenal", 1);
        rating.addPoint("Chelsy", 7);
        rating.addPoint("Zenit", 5);
        rating.addPoint("Spartak", 3);

        rating.sortRating();

    }

}
