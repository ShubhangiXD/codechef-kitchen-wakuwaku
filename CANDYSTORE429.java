import java.util.*;

class CANDYSTORE429
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of test cases:");
		int T = sc.nextInt();
		int amt= 0;
		while (T>0) {
		T--;
        System.out.println("Enter the daily goal: ");
		int X = sc.nextInt();
        System.out.println("Enter the number of candies sold: ");
		int Y = sc.nextInt();
		if (Y > X) 
		    amt = Y + (Y - X);
		else
		amt = Y ;
		System.out.println("Total amount = " + amt);
		}
		sc.close();
	}
}
