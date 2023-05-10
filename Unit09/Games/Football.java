package Games;

import java.util.LinkedList;

public class Football extends Games {
    int quarter = 1;

    public Football (String name, LinkedList<String> players, LinkedList<String> teams) {
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
        teams.add("Buffalo Bills");
        teams.add("New York Giants");
        Football football = new Football ("Football", players, teams);
        System.out.println(football.getQuarter());
        football.nextQuarter();
        System.out.println(football.getQuarter());
    }
}
