package Lesson17;

import java.util.HashMap;
import java.util.Set;

public class Rating {
    private HashMap<String, Integer> rating = new HashMap<>();

    public Rating() {

    }

    public Rating(HashMap<String, Integer> rating) {
        this.rating = rating;
    }

    public void addPoint(String team, int point) {
        if (rating.containsKey(team)) {
            int currentPoint = rating.get(team);
            rating.put(team, currentPoint + point);
        } else {
            rating.put(team, point);
        }
    }

    public void printRating() {
        Set<String> teams = rating.keySet();
        for (String currentTeam : teams) {
            System.out.println(currentTeam + "-------" + rating.get(currentTeam));

        }
    }

    public void getWinner() {
        int max = 0;
        String teamName = "";
        Set<String> teams = rating.keySet();
        for (String currentTeam : teams) {
            if (rating.get(currentTeam) > max) {
                max = rating.get(currentTeam);
                teamName = currentTeam;
            }
        }
        System.out.println(teamName + " Rating: " + "-------" + max);
    }
}
