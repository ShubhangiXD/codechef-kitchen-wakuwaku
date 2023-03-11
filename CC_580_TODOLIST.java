import java.util.*;

public class CC_580_TODOLIST {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] >= 1000)
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
