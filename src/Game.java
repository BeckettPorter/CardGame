public class Game {
    public static void main(String[] args)
    {
        Game game = new Game();
        game.playgame();
    }

    public void playgame()
    {
        Deck deck = new Deck(52);
        Player player = new Player();

        deck.drawDeck();
    }
}