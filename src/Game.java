import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
        int a = 8;
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the game. What is the name of your pitcher?");
        String name = scan.nextLine();

        System.out.print("Now for your pitching stats.\nA pitcher's accuracy determines how accurate their pitches are, decreasing variability and allowing for more consistent pitches. Each stat has a maximum value of 5. You currently have" + a + " total points available. Enter your accuracy stat: ");
        int acc = scan.nextInt();
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
    }
}
