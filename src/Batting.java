public class Batting
{
    private int strikes;
    private int balls;
    private int outs;
    private Batter[] offense;

    public Batting(Batter[] offense)
    {
        this.offense = offense;
    }

    public void batting()
    {
        strikes = 0;
        balls = 0;
        while (strikes < 3 && balls < 4)
        {
            //
        }
    }
}
