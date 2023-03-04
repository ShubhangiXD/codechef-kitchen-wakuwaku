import java.util.*;

class CC_1001_PROGLANG {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		while (T-- >0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int A1 = sc.nextInt();
		    int B1 = sc.nextInt();
		    int A2 = sc.nextInt();
		    int B2 = sc.nextInt();
		    
		    if (A == A1 || A == B1 ){
		        if (B == B1 || B == A1)
		        System.out.println("1");
		        else
		        System.out.println("0");
		    }
		    else if (A == A2 || A == B2) {
		        if (B == B2 || B == A2) 
		            System.out.println("2");
		            else
		            System.out.println("0");
		    }
		}
        sc.close();
    }
}