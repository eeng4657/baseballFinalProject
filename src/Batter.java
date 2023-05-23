public class Batter
{
    private String name;
    private double average;
    private int hits;
    private int atBats;
    private int homeRuns;
    private int runsBattedIn;
    private int onBase;

    public Batter(String name, double average, int hits, int atBats, int homeRuns, int runsBattedIn, int onBase)
    {
        this.name = name;
        this.average = average;
        this.hits = hits;
        this.atBats = atBats;
        this.homeRuns = homeRuns;
        this.runsBattedIn = runsBattedIn;
        this.onBase = onBase;
    }

    public String getName()
    {
        return this.name;
    }

    public double getAve()
    {
        return this.average;
    }

    public void setAve()
    {
        this.average = this.hits/this.atBats;
    }

    public int getHits()
    {
        return this.hits;
    }

    public void madeHit()
    {
        this.hits++;
    }

    public int getHR()
    {
        return this.homeRuns;
    }

    public void thereItGoes()
    {
        this.homeRuns++;
        madeHit();
    }

    public int getRBI()
    {
        return this.runsBattedIn;
    }

    public void gotRBI(int runsScored)
    {
        this.runsBattedIn+=runsScored;
        madeHit();
    }

    public int isOnBase()
    {
        return this.onBase;
    }

    public void runningTheBases(int hit)
    {
        this.onBase+=hit;
    }
}
