public class Ball //https://lokeshdhakar.com/baseball-pitches-illustrated/
{
    private String type;
    private String subtype;
    private int speed;
    private int x;
    private int y;

    public Ball(String type, String subtype, int speed, int x, int y)
    {
        this.type = type;
        this.subtype = subtype;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }
}