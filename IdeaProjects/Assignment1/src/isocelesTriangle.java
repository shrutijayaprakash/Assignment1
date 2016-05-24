/**
 * Created by jashruti on 5/24/16.
 */import java.util.Scanner;
public class isocelesTriangle {
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
