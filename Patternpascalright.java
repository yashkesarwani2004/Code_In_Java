import java.util.Scanner;

public class Patternpascalright {
    
 public static void main(String args[])
 {
    System.out.println("Enter the value of n");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
     {
         System.out.print("*");
     }

     System.out.println();
    }

    for(int j=1;j<=n-1;j++)
    {
        for(int k=n-1;k<=n-j && k>0;k--)
        {
            System.out.print("*");
        }

     System.out.println();
    }
 }
}
