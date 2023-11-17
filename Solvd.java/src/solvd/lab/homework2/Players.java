package solvd.lab.homework2;

public class Players{

    private String country;

    private String name;

    private String sport;

    public Players(String country, String name, String sport){
        this.country = country;
        this.name = name;
        this.sport = sport;
    }

    public String getCountry(){return country;}

    public void setCountry(String country){this.country = country;}

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public String getSport(){return sport;}

    public void setSport(String sport){this.sport = sport;}
}
