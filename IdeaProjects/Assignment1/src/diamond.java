/**
 * Created by jashruti on 5/24/16.
 */import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        int i,j,k,x;
        x=-1;
        Scanner in=new
                Scanner(System.in);
        System.out.println("enter n");
        int n=in.nextInt();
int l=2*n-1;
        for(i=1;i<=l;i++)
        {if(i<=n)
        {x=x+2;
            for(k=i;k<=n-1;k++)
             {System.out.print(" ");}
            for(j=1;j<=x;j++)
            { System.out.print("*");
            }}
            else
        {x=x-2;
            for(k=i-n;k>0;k--)
            {System.out.print(" ");}
            for(j=1;j<=x;j++)
            { System.out.print("*");
            }

            }
            System.out.print("\n");
        }

    }
}
