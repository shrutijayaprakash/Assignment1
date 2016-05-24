/**
 * Created by jashruti on 5/24/16.
 */import java.util.Scanner;
public class horizontalLine {
    public static void main(String[] args)
    {int i,n;
        Scanner in=new
                Scanner(System.in);
        System.out.println("enter number of stars to be printed");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {System.out.print("* ");}

    }
}
