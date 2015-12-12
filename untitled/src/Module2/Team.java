package Module2;

/**
 * Created by Юра on 12.12.2015.
 */

public class Team implements Comparable<Team> {
    private String name;
    private int games;
    private int wins;
    private int losts;
    private int goals;
    private int scores;


    public int compareTo(Team o) {
        return o.scores - this.scores;
    }


    @Override
    public String toString() {
        return String.format(
                " %15s %10d %10d %10d %10d %10d",
                this.name, this.games,
                this.wins, this.losts, this.goals, this.scores
        );
    }


    public String getName() {
        return name;
    }


    public Team addName(String name) {
        this.name = name;
        return this;
    }


    public int getGames() {
        return games;
    }

    public Team addGames(int games) {
        this.games = games;
        return this;
    }


    public int getWins() {
        return wins;
    }


    public Team addWins(int wins) {
        this.wins = wins;
        return this;
    }


    public int getLosts() {
        return losts;
    }


    public Team addLosts(int losts) {
        this.losts = losts;
        return this;
    }


    public int getGoals() {
        return goals;
    }


    public Team addGoals(int goals) {
        this.goals = goals;
        return this;
    }


    public int getScores() {
        return scores;
    }


    public Team addScores(int scores) {
        this.scores = scores;
        return this;
    }
}


