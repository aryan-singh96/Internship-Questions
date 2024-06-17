import java.util.Scanner;
public class numbergame 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = 1+ (int)(100 * Math.random());
        int t = 5; // t= trials
        int i , g; // g = guess 
        System.out.println("A number is choose is between 1 to 100");
        System.out.println("guess the number within 5 trials");
        for(i=0; i<t; i++)
        { 
            System.out.println("guess the number");
            g = sc.nextInt();
            if(num == g)
            {
                System.out.println("well done you guess the number");
                break;
            }
            else if(num > g && i !=t-1)
            {
                System.out.println("the number is greater than " + g);
            }
            else if(num < g && i !=t-1)
            {
                System.out.println("the numbe is smaller than " + g);
            }
        }
        if(i == t)
        {
            System.out.println("you have exhausted " + t + "trials.");
            System.out.println("the number was " + num);
            System.out.println("Play again\nBetter luck next time");
        }
    }
        
}