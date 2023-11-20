package solvd.lab.homework2;

public class Score {
    private Team team;

    private int score;

    Score(Team team, int score) {
        this.team = team;
        this.score = score;
    }

    public Team getTeam(){return team;}

    public void setTeam(Team team){this.team = team;}

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addPoints(int toAdd) {
        this.score += toAdd;
    }
}
