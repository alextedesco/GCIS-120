package Games;

import java.util.LinkedList;

public class Basketball extends Games {
    int quarter = 1;

    public Basketball (String name, LinkedList<String> players, LinkedList<String> teams) {
        super(name, players);
    }

    public int getQuarter() {
        return quarter;
    }

    public void nextQuarter () {
        quarter += 1;
    }

    public static void main(String[] args) {
        LinkedList<String> players = new LinkedList<>();
        players.add("Player 1");
        players.add("Player 2");
        LinkedList<String> teams = new LinkedList<>();
        teams.add("Los Angeles Lakers");
        teams.add("Los Angeles Clippers");
        Basketball basketball = new Basketball("Basketball", players, teams);
        System.out.println(basketball.getQuarter());
        basketball.nextQuarter();
        System.out.println(basketball.getQuarter());
    }
}
