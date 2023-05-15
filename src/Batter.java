public class Batter
{
    private String name;
    private double average;
    private int homeRuns;
    private int RBIs;
    private double OPS;
    private boolean onBase;

    public Batter(String name, double average, int homeRuns, int RBIs, double OPS, boolean onBase)
    {
        this.name = name;
        this.average = average;
        this.homeRuns = homeRuns;
        this.RBIs = RBIs;
        this.OPS = OPS;
        this.onBase = onBase;
    }

    public String getName()
    {
        return this.name;
    }

    //
}
