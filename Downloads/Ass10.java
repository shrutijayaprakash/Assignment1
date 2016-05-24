/**
 * Created by ljhansi on 5/23/16.
 */
import java.util.Scanner;
public class Ass10 {
    public static void main(String[] args) {
        Ass10  obj=new Ass10();
        int n;
        Scanner in=new
                Scanner(System.in);
        System.out.println(" enter the number");
        n=in.nextInt();
        obj.generate(n);
    }
    void generate(int x)
    {int[] arr=null;int j=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                arr[j++] =i;
                x=x/i;
            }
        }
        for(int m=0;m<j-1;m++)
        {for(int p=1;p<j-1;p++)
        {if(arr[m]<=arr[p])
        {
            int t=arr[m];
            arr[m]=arr[p];
            arr[p]=t;
        }
        }
        } for(int r=0;r<j-1;r++)
    {System.out.println(arr[r]);}}
}
