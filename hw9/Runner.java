package hw9;


import org.apache.log4j.PropertyConfigurator;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        System.out.println("Enter log level (DEBUG, INFO, WARN, ERROR etc): ");
        Scanner scanner = new Scanner(System.in);
        String logLevel = scanner.nextLine().toUpperCase();

        System.setProperty("log.level", logLevel);
        PropertyConfigurator.configure("resources/log4j.properties");

        Game game = new Game();
        game.hello();

        do {
            game.play();

            if (game.getPlayedGames() == game.getQuantityOfGames()){
                game.stop();}
        } while (game.getQuantityOfGames() != game.getPlayedGames());
    }
}