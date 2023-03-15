import java.util.*;
class CC_285_MINHEIGHT {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
		    int X = sc.nextInt();
		    int H = sc.nextInt();
		    if (H>X)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		}
        sc.close();
	}
}