import java.util.*;

class CC_584_BETDEAL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		//System.out.println("Enter the number of test cases: ");
		int T = sc.nextInt();
		while (T>0) {
		    T--;
		    //System.out.println("Enter the discount for store A: ");
		    int A = sc.nextInt();
		    //System.out.println("Enter the discount for store B: ");
		    int B = sc.nextInt();
		    int amtA = 100 - ((100 * A)/100);
		    int amtB = 200 - ((200 * B) /100);
		    if (amtA < amtB)
		    System.out.println("FIRST");
		    else if (amtB < amtA)
		    System.out.println("SECOND");
		    else
		    System.out.println("BOTH");
		}
        sc.close();
	}
}
