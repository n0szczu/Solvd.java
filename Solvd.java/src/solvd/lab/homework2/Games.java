package solvd.lab.homework2;

public class Games{

    private int countries;//number of countries

    private int finishedGames;

    private int gamesLeft;

    Games(int countries, int finishedGames, int gamesLeft){
        this.countries = countries;
        this.finishedGames = finishedGames;
        this.gamesLeft = gamesLeft;
    }

    public int getCountries(){return countries;}

    public void setCountries(int countries){this.countries = countries;}

    public int getFinishedGames(){return finishedGames;}

    public void setFinishedGames(int finishedGames){this.finishedGames = finishedGames;}

    public int getGamesLeft(){return gamesLeft;}

    public void setGamesLeft(int gamesLeft){this.gamesLeft = gamesLeft;}

}