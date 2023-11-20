package solvd.lab.homework2;

public class Team{

    private Country country;

    private String name;

    private String sport;

    private boolean chance;

    public Team(Country country, String name, String sport, boolean chance){
        this.country = country;
        this.name = name;
        this.sport = sport;
        this.chance = chance;
    }

    public Country getCountry(){return country;}

    public void setCountry(Country country){this.country = country;}

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public String getSport(){return sport;}

    public void setSport(String sport){this.sport = sport;}

    public boolean getChance(){return chance;}

    public void setChance(boolean chance){this.chance = chance;}
}
