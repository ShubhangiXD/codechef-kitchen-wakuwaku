import java.util.*;

public class CC_1012_ZCOSCH {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        if (R >= 1 && R <= 50)
            System.out.println("100");
        else if (R >= 51 && R <= 100)
            System.out.println("50");
        else
            System.out.println("0");
        sc.close();
    }
}
