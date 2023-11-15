package hw9;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import static hw9.VarOfChoice.*;

public class WhoWin {
    private static final Logger log = LogManager.getLogger("WhoWin.class");

    private static int compWins=0;
    private static int playerWins=0;

    public static void whoWin(VarOfChoice player, VarOfChoice comp){
        if (player.equals(comp)){
            System.out.println("Dead heat");
            log.debug("Dead heat");
        } else if (player == ROCK && comp == SCISSORS ||
                player == SCISSORS && comp == PAPER ||
                player == PAPER && comp == ROCK){

            playerWins++;
            log.debug("Player won");
            System.out.println("Player wins");
        } else{
            compWins++;
            log.debug("Comp won");
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