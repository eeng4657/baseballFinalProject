public class Batting
{
    private int strikes;
    private int balls;
    private int outs;
    private Batter current;
    //private Batter[] offense;

    public Batting(Batter current)
    {
        this.current = current;
    }

    public void play()
    {
        strikes = 0;
        balls = 0;
        while (strikes < 3 && balls < 4)
        {
            //
        }
    }
}
