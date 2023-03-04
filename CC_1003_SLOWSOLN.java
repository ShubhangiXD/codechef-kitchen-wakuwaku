import java.util.*;
public class CC_1003_SLOWSOLN {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- >0) {
		    int maxT = sc.nextInt(); //number of terms
		    int maxN = sc.nextInt(); // the value of N basically
		    int sumN = sc.nextInt(); // sum of series
		    int rem = 0;
		    int quo = 0;
		    if(sumN/maxN >= maxT){
		        System.out.println(maxT*maxN*maxN);
		    } else if(sumN/maxN < maxT){
		        quo = sumN/maxN;
		        rem = sumN%maxN;
		        System.out.println(quo*maxN*maxN + (int)Math.pow(rem,2));
		    }
		}
        sc.close();
	}
}
