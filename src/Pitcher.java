public class Pitcher
{
    private String name;
    private int accuracy;
    private int stability;
    private int power;
    private double ERA;
    private int walksAllowed;
    private int homeRunsAllowed;

    public Pitcher(String name, int accuracy, int stability, int power, double ERA, int walksAllowed, int homeRunsAllowed)
    {
        this.name = name;
        this.accuracy = accuracy;
        this.stability = stability;
        this.power = power;
        this.ERA = ERA;
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
        return this.ERA;
    }

    public int getwalksAllowed()
    {
        return this.walksAllowed;
    }

    public int getHomeRunsAllowed()
    {
        return this.homeRunsAllowed;
    }
}