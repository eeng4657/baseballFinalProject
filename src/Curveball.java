public class Curveball extends Ball
{
    private int curve;

    public Curveball(String type, int speed, int curve)
    {
        super(type, speed);
        this.curve = curve;
    }

    public int getCurve()
    {
        return this.curve;
    }
}
