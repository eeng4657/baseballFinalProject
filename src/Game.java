public class Game
{
    private int inning;
    private int strikes;
    private int balls;
    private int outs;
    private Batter[] offense;

    public Game(Batter[] offense)
    {
        this.offense = offense;
    }

    public void play()
    {
        inning = 0;
        while (inning <= 9)
        {
            while (outs < 3)
            {
                //
            }
        }
    }
}
