package Games;

import java.util.LinkedList;

public class Baseball extends Games {
    int inning = 1;

    public Baseball(String name, LinkedList<String> players, LinkedList<String> teams) {
        super(name, players);
    }

    public int getInning() {
        return inning;
    }

    public void nextInning () {
        inning += 1;
    }

    public static void main(String[] args) {
        LinkedList<String> players = new LinkedList<>();
        players.add("Player 1");
        players.add("Player 2");
        LinkedList<String> teams = new LinkedList<>();
        teams.add("New York Yankees");
        teams.add("Boston Red Sox");
        Baseball baseball = new Baseball("Baseball", players, teams);
        System.out.println(baseball.getInning());
        baseball.nextInning();
        System.out.println(baseball.getInning());

    }
}
