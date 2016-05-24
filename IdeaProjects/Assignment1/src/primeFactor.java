/**
 * Created by jashruti on 5/24/16.
 */import java.util.Scanner;
public class primeFactor {
    public static void main(String[] args) {
        primeFactor obj = new primeFactor();
        int n;
        Scanner in = new
                Scanner(System.in);
        System.out.println(" enter the number");
        n = in.nextInt();
        obj.generate(n);
    }

    void generate(int n) {
        int i, j, check;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                check = 1;
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = 0;
                        break;
                    }

                }
                if (check == 1)
                    System.out.print(i+" ");
            }
        }
    }
}
