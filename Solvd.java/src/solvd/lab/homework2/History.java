package solvd.lab.homework2;

public class History{

    private String countryName;

    private String score;

    private int prizePool;

    public History(String countryName, String score, int prizePool){
        this.countryName = countryName;
        this.score = score;
        this.prizePool = prizePool;
    }

    public String getCountryName(){return countryName;}

    public void setCountryName(String countryName){this.countryName = countryName;}

    public String getScore(){return score;}

    public void setScore(String score){this.score = score;}

    public int getPrizePool(){return prizePool;}

    public void setPrizePool(int prizePool){this.prizePool = prizePool;}
}