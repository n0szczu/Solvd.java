package solvd.lab.homework2;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Games games = new Games(6,15, 2);
        News news = new News("Poland vs Russia","5:4", 5000000);
        Country poland = new Country("Poland", 6,5, "yes");
        Country germany = new Country("Germany", 4,2, "yes");
        Country france = new Country("France", 3,4, "yes");
        Country england = new Country("England", 1,3, "yes");
        Country russia = new Country("Russia", 1,1, "no");
        Country brazil = new Country("Brazil", 2,0, "no");
        Winner winner = new Winner(poland,5, 2000000);
        Player player = new Player(brazil, "George", "Archery");
        History history = new History(brazil, "7",2000000);
        Sponsor sponsor = new Sponsor("AppleTown", "Poland",1000000);
        Team team1 = new Team(england, "Eagles", "Football", true);
        Team team2 = new Team(germany, "Schmetterlinge", "Football", true);
        CurrentGame currentGame = new CurrentGame(new Score(team1, 0), new Score(team2, 0), false);

        Random rand = new Random();
        currentGame.getTeam1().addPoints(rand.nextInt(1, 5));
        currentGame.getTeam2().addPoints(rand.nextInt(1, 5));
        System.out.println(currentGame.getTeam1().getTeam().getName() + " " + currentGame.getTeam1().getScore() + ":" +
                currentGame.getTeam2().getScore() + " " + currentGame.getTeam2().getTeam().getName());
        System.out.println("Game winner: " + currentGame.getWinner().getTeam().getName());
    }
}