import java.util.*;
public class CC_245_AGELIMIT {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0)
		{
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int A = sc.nextInt();
		    if (A>=X && A<Y)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
        sc.close();
	}
}
