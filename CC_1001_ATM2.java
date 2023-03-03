import java.util.*;

class CC_298_JERRYCHASE {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(); // people units
            int K = sc.nextInt(); // money units
            String result = "";
            int tmp = 0;
            for (int i = 0; i < N; i++) {
                tmp = sc.nextInt();
                if (tmp <= K) {
                    K = K - tmp;
                    result += "1";
                } else {
                    result += "0";
                }
            }

            System.out.println(result);

        }
        sc.close();
    }
}
