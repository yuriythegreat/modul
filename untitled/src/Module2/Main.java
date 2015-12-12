package Module2;

/**
 * Created by Юра on 12.12.2015.
 */

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int group = 0;
        int numberOfTeam = 0;
        List<Team> teams = table();
        String s = " №|         Команда  |    Ігри  |  Перемоги |  Програші  |   Голи |   Рахунок  | \n" +
                "------------------------------------------------------------------------------";
        int choose = -1;
        while (choose != 0) {
            System.out.println("1.Подивитися турнірну таблицю");
            System.out.println("2.Подивитися групи");
            System.out.println("3.Додати команду");
            System.out.println("4.Виключити команду з турніру");
            System.out.println("5.Шукати команду у таблиці");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println(s);
                    for (int i = 0; i < teams.size(); i++) {
                        if (i < 9) {
                            System.out.println(" " + (i + 1) + teams.get(i));
                        } else if (i >= 10) {
                            System.out.println(String.valueOf(i + 1) + teams.get(i));
                        }
                        if (i == teams.size() - 5) {
                            System.out.println("Зона вильоту");
                            System.out.println("------------------------------------------------------------------------------");
                        }
                    }
                    break;
                case 2:
                    System.out.println(s);
                    for (int i = 0; i < teams.size(); i++) {
                        if (i % 4 == 0) {
                            group++;
                            System.out.println("------------------------------------------------------------------------------");
                            System.out.println("Група" + group);
                            numberOfTeam = 0;
                        }
                        numberOfTeam++;
                        System.out.println(String.valueOf(numberOfTeam) + teams.get(i));
                    }
                    break;
                case 3:
                    int games = 0;
                    for (Team entry : teams) {
                        games = entry.getGames();
                    }
                    System.out.println("Назва команди");
                    String name = scanner.nextLine();
                    int randomWins = random.nextInt(50);
                    while (randomWins > games) {
                        randomWins = random.nextInt(50);
                    }
                    teams.add(
                            new Team().addName(name).addGames(games).addWins(randomWins).addLosts(games - randomWins).addGoals(random.nextInt(75)).addScores(randomWins * 3)
                    );
                    break;
                case 4:
                    for (int i = 0; i < teams.size(); i++) {
                        if (i < 9) {
                            System.out.println(" " + (i + 1) + teams.get(i));
                        } else
                            System.out.println(String.valueOf(i + 1) + teams.get(i));
                    }
                    int choose1 = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < teams.size(); i++) {
                        if (choose1 - 1 == i) {
                            teams.remove(i);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Яку команду хочете знайти?");
                    name = scanner.nextLine();
                    for (Team lookFor : teams) {
                        if (lookFor.getName().contains(name)) {
                            System.out.println(s);
                            System.out.println("  " + lookFor);
                        }
                    }
            }
        }
    }


    public static List<Team> table() {
        Set<Team> team = new HashSet<Team>();
        Random random = new Random();
        int randomGames = random.nextInt(50);
        for (int i = 0; i < TeamsCreator.team.length; i++) {
            int randomWins = random.nextInt(50);
            while (randomWins > randomGames) {
                randomWins = random.nextInt(50);
            }
            team.add(
                    new Team().addGames(randomGames).addName(TeamsCreator.team[i]).addGames(randomGames).addWins(randomWins).addLosts(randomGames - randomWins).addGoals(random.nextInt(75)).addScores(randomWins * 3)
            );
        }
        List<Team> teams = new ArrayList<Team>(team);
        Collections.sort(teams);
        return teams;
    }


}
