/**
 * Created by ljhansi on 5/23/16.
 */
import java.util.Scanner;
public class Ass9 {
    public static void main(String[] args) {
        int i, j, k, m, x,y;
        x = 1;
        Scanner in = new
                Scanner(System.in);
        System.out.println("enter the number of lines in pattern");
        int n = in.nextInt();y=n-2;
        m = n / 2;
        for (int l = 1; l <= n; l++) {
            if(l==(n/2)+1)
                System.out.print("SHRUTI\n");
            else if (l <= ((n / 2) )) {
                for (k = l; k <= m + 1; k++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= x; j++) {
                    System.out.print("*");
                }

                x=x+2;System.out.print("\n");
            } else {
                for (k = l; k >= m+1; k--) {
                    System.out.print(" ");
                }
                for (j = 1; j <= y; j++) {
                    System.out.print("*");
                }

                System.out.print("\n");y=y-2;

            }

        }
    }
}
