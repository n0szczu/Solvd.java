package solvd.lab.homework2;

public class Player{

    private Country country;

    private String name;

    private String sport;

    public Player(Country country, String name, String sport){
        this.country = country;
        this.name = name;
        this.sport = sport;
    }

    public Country getCountry(){return country;}

    public void setCountry(Country country){this.country = country;}

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public String getSport(){return sport;}

    public void setSport(String sport){this.sport = sport;}
}
