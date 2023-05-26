import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
        int a = 8;
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the game. What is the name of your pitcher?");
        String name = scan.nextLine();

        System.out.print("Now for your pitching stats.\nA pitcher's accuracy determines how accurate their pitches are, decreasing variability and allowing for more consistent pitches. Each stat has a maximum value of 5. You currently have" + a + " total points available. Enter your accuracy stat: ");            int acc = scan.nextInt();
        while (acc > 5 || (a-acc) < 0)
        {
            System.out.print("You have entered an invalid stat. Please select again:");
            acc = scan.nextInt();
         }
        a -= acc;

        System.out.print("A pitcher's stability determines how stable their pitches are. This stat greatly reduces the chances of balls or wild pitches. Each stat has a maximum value of 5. You currently have" + a + " total points available. Enter your accuracy stat: ");
        int stable = scan.nextInt();
        while (stable > 5 || (a-stable) < 0)
        {
            System.out.print("You have entered an invalid stat. Please select again:");
            stable = scan.nextInt();
        }
        a -= stable;

        System.out.print("A pitcher's power determines how fast their pitches are. This stat greatly reduces the chances of pitches being successfully hit into play. Each stat has a maximum value of 5. You currently have" + a + " total points available. Enter your accuracy stat: ");
        int power = scan.nextInt();
        while (power > 5 || (a-power) < 0)
        {
            System.out.print("You have entered an invalid stat. Please select again:");
            power = scan.nextInt();
        }
        a -= power;

        Pitcher player = new Pitcher(name, acc, stable, power);
        System.out.print("Choose a team to play against:");

        Batter[] offense = new Batter[9];

        int inning = 1;
        int strikes = 0;
        int balls = 0;
        int outs = 0;

        while (inning <= 9)
        {
            while (outs < 3)
            {
                for (int i = 0; i < offense.length; i++)
                {
                    while (strikes < 3 || balls < 4)
                    {
                        System.out.print("What pitch would you like to throw?");
                        int type = scan.nextInt();
                        int subtype = 0;
                        if (type == 1)
                        {
                            System.out.print("What fastball would you like to throw?");
                            subtype = scan.nextInt();
                            player.pitch(type, subtype);
                            offense[i].hit(player.getCurrentPitch().getSpeed(), player.getCurrentPitch().getX(), player.getCurrentPitch().getY());
                        }
                        if (type == 2)
                        {
                            System.out.print("What breaking ball would you like to throw?");
                            subtype = scan.nextInt();
                            player.pitch(type, subtype);
                            offense[i].hit(player.getCurrentPitch().getSpeed(), player.getCurrentPitch().getX(), player.getCurrentPitch().getY());
                        }
                        if (type == 3)
                        {
                            System.out.print("What changeup would you like to throw?");
                            subtype = scan.nextInt();
                            player.pitch(type, subtype);
                            offense[i].hit(player.getCurrentPitch().getSpeed(), player.getCurrentPitch().getX(), player.getCurrentPitch().getY());
                        }
                    }
                }
            }
            inning++;
        }
    }
}
