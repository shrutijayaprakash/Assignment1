/**
 * Created by ljhansi on 5/23/16.
 */
import java.util.Scanner;
public class Ass7 {
    public static void main(String[] args) {
        int i,j,k,x;
        x=1;
        Scanner in=new
                Scanner(System.in);
        System.out.println("enter the number of lines in pattern");
        int n=in.nextInt();
        for(i=1;i<=n;i++)
        {for(k=i;k<=n-1;k++)
        {System.out.print(" ");}
            for(j=1;j<=x;j++)
            { System.out.print("*");
            }x=x+2;
            System.out.print("\n");
        }}
}
