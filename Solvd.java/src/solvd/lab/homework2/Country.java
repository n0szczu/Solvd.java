package solvd.lab.homework2;

public class Country {
    private String name;
  
    private int expectations;
  
    private int score;
  
    private String chance; //chances of being in top 3
  
    public Country(String name, int expectations, int score, String chance){
        this.name = name;
        this.expectations = expectations;
        this.score = score;
        this.chance = chance;
    }
  
    public String getName(){return name;}
  
    public void setName(String Name){this.name = Name;}
  
    public int getExpectations(){return expectations;}
  
    public void setExpectations(int Expectations){this.expectations = Expectations;}
  
    public int getScore(){return score;}
  
    public void setScore(int score){this.score = score;}
  
    public String getChance(){return chance;}
  
    public void setChance(String Chance){this.chance = Chance;}
}
