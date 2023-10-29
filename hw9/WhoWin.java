package hw9;

import static hw9.VarOfChoice.*;

public class WhoWin {

    private static int compWins=0;
    private static int playerWins=0;

    public static void whoWin(VarOfChoice player, VarOfChoice comp){
        if (player.equals(comp)){
            System.out.println("Dead heat");
        } else if (player == ROCK && comp == SCISSORS ||
                player == SCISSORS && comp == PAPER ||
                player == PAPER && comp == ROCK){

            playerWins++;
            System.out.println("Player wins");
        } else{
            compWins++;
            System.out.println("Comp wins");
        }
    }

    public static int getCompWins() {
        return compWins;
    }

    public static int getPlayerWins() {
        return playerWins;
    }

}