/**
 * Created by ljhansi on 5/23/16.
 */
import java.util.Scanner;
public class Ass6 {
    public static void main(String[] args) {
        int n,i;
        Scanner in=new
                Scanner(System.in);
        System.out.println("enter the end number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {if ((i%3)==0 && (i%5)==0)
            System.out.println("FizzBuzz");
        else if((i%3)==0)
            System.out.println("Fizz");
        else if((i%5)==0)
            System.out.println("Buzz");
        else
            System.out.println(i);
        }
    }
}
