package hw9;

import java.util.Scanner;

import static hw9.Comp.randomChoice;
import static hw9.WhoWin.*;

public class Game implements GameService {

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
    }

    public void play(){
        VarOfChoice playerChoice = player.playerMakeChoice();
        VarOfChoice compChoice = randomChoice();

        whoWin(playerChoice, compChoice);
        playedGames++;
    }

    public void stop(){
        System.out.println(player.getName() + " you win " + getPlayerWins() + " games \n" +
                "Comp wins " + getCompWins() + " games");


        System.out.println("Bye. See you later.");
    }


    public int getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
    }

    public int getQuantityOfGames() {
        return quantityOfGames;
    }

    public void setQuantityOfGames(int quantityOfGames) {
        this.quantityOfGames = quantityOfGames;
    }
}
