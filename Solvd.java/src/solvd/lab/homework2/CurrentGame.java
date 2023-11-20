package solvd.lab.homework2;

public class CurrentGame{

    private Score team1;
    private Score team2;

    private boolean chances;

    public CurrentGame(Score team1, Score team2, boolean chances){
        this.team1 = team1;
        this.team2 = team2;
        this.chances = chances;
    }

    public Score getTeam1() {
        return team1;
    }

    public void setTeam1(Score team1) {
        this.team1 = team1;
    }

    public Score getTeam2() {
        return team2;
    }

    public void setTeam2(Score team2) {
        this.team2 = team2;
    }

    public boolean getChances(){return chances;}

    public void setChances(boolean chances){this.chances = chances;}

    public Score getWinner() {
        if (team1.getScore() > team2.getScore())
            return team1;
        else
            return team2;
    }
}
