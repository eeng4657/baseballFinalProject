public class Pitcher
{
    private String name;
    private int accuracy;
    private int stability;
    private int power;
    private double earnedRunAverage;
    private int walksAllowed;
    private int homeRunsAllowed;
    private Ball currentPitch;
    private String[][] pitches = {{"Four-seam", "Two-seam", "Cutter", "Splitter", "Forkball"},{"Curveball", "Slider", "Slurve", "Screwball"},{"Changeup", "Palmball", "Circle Changeup"}};

    public Pitcher(String name, int accuracy, int stability, int power)
    {
        this.name = name;
        this.accuracy = accuracy;
        this.stability = stability;
        this.power = power;
        this.earnedRunAverage = 0;
        this.walksAllowed = 0;
        this.homeRunsAllowed = 0;
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
        return this.earnedRunAverage;
    }

    public int getwalksAllowed()
    {
        return this.walksAllowed;
    }

    public int getHomeRunsAllowed()
    {
        return this.homeRunsAllowed;
    }

    /*public String getCurrentPitch()
    {
        return this.currentPitch.getType();
    }*/

    /*public void setCurrentPitch(int a, int b)
    {
        this.currentPitch.setType(pitches[a][b]);
    }*/

    public void pitch(int a, int b) //calculates speed, x and y position of pitch, if works correctly, getCurrentPitch() and setCurrentPitch() will not be necessary
    {
        this.currentPitch.setType(pitches[a][b]);
        //calculate x-pos of pitch, set CurrentPitch instance variable "x" to result
        //calculate y-pos of pitch, set currentPitch instance variable "y" to result
        //calculate speed of pitch, set currentPitch instance variable "speed" to result
    }
}