/**
 * Created by ljhansi on 5/23/16.
 */
import java.util.Scanner;
public class Ass5 {
    public static void main(String[] args) {
        int i,j;
        Scanner in=new
                Scanner(System.in);
        System.out.println("enter the number of lines in pattern");
        int n=in.nextInt();
        for(i=0;i<n;i++)
        {for(j=n;j>i;j--)
        { System.out.print("*");
        }System.out.print("\n");
        }}
}
