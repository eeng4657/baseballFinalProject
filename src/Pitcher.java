public class Pitcher
{
    private String name;
    private int accuracy;
    private int stability;
    private int power;
    private double earnedRuns;
    private int walksAllowed;
    private int homeRunsAllowed;
    private Ball currentPitch;
    private String[][] pitches = {{"Four-seam", "Two-seam", "Cutter", "Splitter", "Forkball"},{"Curveball", "Slider", "Slurve", "Screwball"},{"Changeup", "Palmball", "Circle Changeup"}};

    public Pitcher(String name, int accuracy, int stability, int power, double earnedRuns, int walksAllowed, int homeRunsAllowed)
    {
        this.name = name;
        this.accuracy = accuracy;
        this.stability = stability;
        this.power = power;
        this.earnedRuns = earnedRuns;
        this.walksAllowed = walksAllowed;
        this.homeRunsAllowed = homeRunsAllowed;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAcc()
    {
        return this.accuracy;
    }

    public int getStability()
    {
        return this.stability;
    }

    public int getPower()
    {
        return this.power;
    }

    public double getERA()
    {
        return this.earnedRuns;
    }

    public int getwalksAllowed()
    {
        return this.walksAllowed;
    }

    public int getHomeRunsAllowed()
    {
        return this.homeRunsAllowed;
    }

    public Ball getCurrentPitch()
    {
        return this.currentPitch;
    }

    public void setCurrentPitch(int a, int b)
    {
        this.currentPitch.setType(pitches[a][b]);
    }

    public void pitch(int a, int b)
    {
        //
    }
}