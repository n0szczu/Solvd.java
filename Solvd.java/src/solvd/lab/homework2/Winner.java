package solvd.lab.homework2;

public class Winner{

    private Country country;

    private int score;//games won

    private int prize;

    public Winner(Country country, int score, int prize){
        this.country = country;
        this.score = score;
        this.prize = prize;
    }

    public Country getCountry(){return country;}

    public void setCountry(Country country){this.country = country;}

    public int getScore(){return score;}

    public void setScore(int score){this.score = score;}

    public int getPrize(){return prize;}

    public void setPrize(int prize){this.prize = prize;}
}
