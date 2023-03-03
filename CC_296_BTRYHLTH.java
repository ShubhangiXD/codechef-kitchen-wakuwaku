import java.util.*;

class CC_296_BTRYHLTH
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number of test cases:");
		int T = sc.nextInt();
		while (T>0) {
		    //System.out.println("Enter the battery health: ");
		    int X = sc.nextInt();
		    if (X >=80)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		    
		    T--;
		}
        sc.close();
	}
}
