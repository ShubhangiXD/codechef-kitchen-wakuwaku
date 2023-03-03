import java.util.*;

public class CC_1000_EZSPEAK {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            s.toLowerCase();
            if (n < 4) {
                System.out.println("YES");
            } else {
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    char a = s.charAt(i);
                    if (count == 4) {
                        break;
                    }
                    if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                        count = 0;
                    } else {
                        count++;
                    }
                }
                if (count == 4) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}