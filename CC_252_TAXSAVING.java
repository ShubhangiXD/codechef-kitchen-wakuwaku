import java.util.*;
public class CC_252_TAXSAVING {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt(); // money I have earned
            int Y = sc.nextInt(); // money beyond which I am taxed
            System.out.println(X - Y);
        }
        sc.close();
    }
}
