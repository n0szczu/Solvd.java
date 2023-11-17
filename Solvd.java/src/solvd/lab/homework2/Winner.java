package solvd.lab.homework2;

public class Winner{

    private String country;

    private int score;//games won

    private int prize;

    public Winner(String country, int score, int prize){
        this.country = country;
        this.score = score;
        this.prize = prize;
    }

    public String getCountry(){return country;}

    public void setCountry(String country){this.country = country;}

    public int getScore(){return score;}

    public void setScore(int score){this.score = score;}

    public int getPrize(){return prize;}

    public void setPrize(int prize){this.prize = prize;}
}
