public class Curveball extends Ball
{
    private int curve;

    public Curveball(String type, int speed, int x, int y, int curve)
    {
        super(type, speed, x, y);
        this.curve = curve;
    }

    public int getCurve()
    {
        return this.curve;
    }
}
