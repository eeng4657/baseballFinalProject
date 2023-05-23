public class Ball //https://lokeshdhakar.com/baseball-pitches-illustrated/
{
    private String type;
    private int speed;
    private int x;
    private int y;

    public Ball(String type, int speed)
    {
        this.type = type;
        this.speed = speed;
        this.x = 0;
        this.y = 0;
    }

    public String getType()
    {
        return this.type;
    }

    public void setType(String newType)
    {
        this.type = newType;
    }

    public int getSpeed()
    {
        return this.speed;
    }

    public void setSpeed(int newSpeed)
    {
        this.speed = newSpeed;
    }

    public int getX()
    {
        return this.x;
    }

    public void setX(int newX)
    {
        this.x = newX;
    }

    public int getY()
    {
        return this.y;
    }

    public void setY(int newY)
    {
        this.y = newY;
    }
}