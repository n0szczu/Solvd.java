package solvd.lab.homework2;

public class Sponsor{

    private String company;

    private String supporting;

    private int money;

    public Sponsor(String company, String supporting, int money){
        this.company = company;
        this.supporting = supporting;
        this.money = money;
    }

    public String getCompany(){return company;}

    public void setCompany(String company){this.company = company;}

    public String getSupporting(){return supporting;}

    public void setSupporting(String supporting){this.supporting = supporting;}

    public int getMoney(){return money;}

    public void setMoney(int money){this.money = money;}
}