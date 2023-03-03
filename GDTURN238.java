import java.util.*;

class GDTURN238
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number of test cases:");
		int T = sc.nextInt();
		for (int i=1; i<=T; i++) {
		    //System.out.println("Enter X and Y: ");
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if (x+y>6)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
        sc.close();
	}
}
