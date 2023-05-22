public class Curveball extends Ball
{
    private int curve;

    public Curveball(String type, String subtype, int speed, int x, int y, int curve)
    {
        super(type, subtype, speed, x, y);
        this.curve = curve;
    }

    public int getCurve()
    {
        return this.curve;
    }
}
