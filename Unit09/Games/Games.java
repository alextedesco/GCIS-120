package Games;

import java.util.HashMap;
import java.util.List;

public class Games {

    String name;
    HashMap<String, Integer> scores;

    public Games (String name, List<String> players) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getScores() {
        return scores;
    }

    public void updateScore (String player, int points) {
        scores.put(player, points);
    }
}