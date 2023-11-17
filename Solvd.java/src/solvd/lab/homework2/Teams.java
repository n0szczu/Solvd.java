package solvd.lab.homework2;

public class Teams{

    private String name;

    private String sport;

    private boolean chance;

    public Teams(String name, String sport, boolean chance){
        this.name = name;
        this.sport = sport;
        this.chance = chance;
    }

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public String getSport(){return sport;}

    public void setSport(String sport){this.sport = sport;}

    public boolean getChance(){return chance;}

    public void setChance(boolean chance){this.chance = chance;}
}
