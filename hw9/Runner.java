package hw9;



public class Runner {

    public static void main(String[] args) {

        Game game = new Game();
        game.hello();

        do {
            game.play();

            if (game.getPlayedGames() == game.getQuantityOfGames()){
                game.stop();}
        } while (game.getQuantityOfGames() != game.getPlayedGames());
    }
}