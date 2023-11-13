package hw9;

import lombok.Getter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

import static hw9.Comp.randomChoice;
import static hw9.WhoWin.*;
import static hw9.WhoWin.whoWin;

@Getter
public class Game implements GameService {
    private static final Logger log = LogManager.getLogger("Game.class");

    private int playedGames = 0;
    private int quantityOfGames;

    private Player player = new Player();

    public void hello(){
        System.out.println("Welcome to game 'rock-paper-scissors'. Please enter your name");

        Scanner scanner=new Scanner(System.in);
        player.setName(scanner.nextLine());

        System.out.println("Hello " + player.getName() + "\n" +
                "Enter quantity of games you want to play.");

        quantityOfGames = scanner.nextInt();
        log.info("Game started");
    }

    public void play(){
        log.info("playing...");
        VarOfChoice playerChoice = player.playerMakeChoice();
        VarOfChoice compChoice = randomChoice();
        log.debug("Comp chose " + compChoice);
        log.debug("Player chose " + playerChoice);

        whoWin(playerChoice, compChoice);
        playedGames++;
    }

    public void stop(){
        System.out.println(player.getName() + " you win " + getPlayerWins() + " games \n" +
                "Comp wins " + getCompWins() + " games");

        System.out.println("Bye. See you later.");
        log.info("Game over");
    }
}
