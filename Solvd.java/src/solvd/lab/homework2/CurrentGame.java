package solvd.lab.homework2;

public class CurrentGame{

    private String rivals;

    private String score;

    private boolean chances;

    public CurrentGame(String rivals, String score, boolean chances){
        this.rivals = rivals;
        this.score = score;
        this.chances = chances;
    }

    public String getRivals(){return rivals;}

    public void setRivals(String rivals){this.rivals = rivals;}

    public String getScore(){return score;}

    public void setScore(String score){this.score = score;}

    public boolean getChances(){return chances;}

    public void setChances(boolean chances){this.chances = chances;}
}
