import java.util.*;

public class CC_668_CANDYDIST {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(); // candies
            int M = sc.nextInt(); // people
            if (N % M == 0 && (N / M) % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
