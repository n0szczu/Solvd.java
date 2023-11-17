package solvd.lab.homework2;

public class Main {
    public static void main(String[] args)
    {
        Games games = new Games(6,15, 2);
        Winner winner = new Winner("Poland",5, 2000000);
        News news = new News("Poland vs Russia","5:4", 5000000);
        Country poland = new Country("Poland", 6,5, "yes");
        Country germany = new Country("Germany", 4,2, "yes");
        Country france = new Country("France", 3,4, "yes");
        Country england = new Country("England", 1,3, "yes");
        Country russia = new Country("Russia", 1,1, "no");
        Country brazil = new Country("Brazil", 2,0, "no");
        CurrentGame currentGame = new CurrentGame("Brazil vs Poland", "1:2", false);
        Players players = new Players("Brazil", "George", "Archery");
        History history = new History("Brazil", "7",2000000);
        Sponsors sponsors = new Sponsors("AppleTown", "Poland",1000000);
        Teams teams = new Teams("Eagles", "Football", true);
    }
}