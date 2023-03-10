import java.util.*;
public class CC_281_TALLER {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
		    int X = sc.nextInt(); //ALice
		    int Y = sc.nextInt(); //Bob
		    if (X > Y)
		    System.out.println("A");
		    else
		    System.out.println("B");
		}
	}
}
