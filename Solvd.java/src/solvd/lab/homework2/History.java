package solvd.lab.homework2;

public class History{

    private Country country;

    private String score;

    private int prizePool;

    public History(Country country, String score, int prizePool){
        this.country = country;
        this.score = score;
        this.prizePool = prizePool;
    }

    public Country getCountryName(){return country;}

    public void setCountryName(Country countryName){this.country = countryName;}

    public String getScore(){return score;}

    public void setScore(String score){this.score = score;}

    public int getPrizePool(){return prizePool;}

    public void setPrizePool(int prizePool){this.prizePool = prizePool;}
}