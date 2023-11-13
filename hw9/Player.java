package hw9;

import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.*;

@Getter
@Setter
public class Player {

    private static final Logger log = LogManager.getLogger("Player.class");
    private String name;

    public VarOfChoice playerMakeChoice() {

        VarOfChoice playerChoice = null;

        do {

            System.out.println(name + " make your choice from: ROCK, PAPER, SCISSORS");

            Scanner scanner = new Scanner(System.in);
            String enteredChoice = scanner.nextLine().toUpperCase(Locale.ROOT);

            try {
                playerChoice = VarOfChoice.valueOf(enteredChoice);
            } catch (IllegalArgumentException e) {
                log.warn("Wrong input. Try again.");
            }
        } while (playerChoice == null);

        return playerChoice;
    }
}
