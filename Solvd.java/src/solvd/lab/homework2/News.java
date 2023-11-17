package solvd.lab.homework2;

public class News{

    private String rivals;

    private String score;

    private int prizePool;

    public News(String rivals, String score, int prizePool){
        this.rivals = rivals;
        this.score = score;
        this.prizePool = prizePool;
    }

    public String getRivals2(){return rivals;}

    public void setRivals(String rivals){this.rivals = rivals;}

    public String getScore(){return score;}

    public void setScore(String score){this.score = score;}

    public int getPrizePool(){return prizePool;}

    public void setPrizePool(int prizePool){this.prizePool = prizePool;}
}
