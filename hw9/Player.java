package hw9;

import java.util.*;

public class Player {

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
                System.out.println("Wrong input. Try again.");
            }
        } while (playerChoice == null);

        return playerChoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
