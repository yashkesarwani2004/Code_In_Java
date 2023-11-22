import java.util.Scanner;

public class Isprimefun {
    
 public static void main(String args[])
 {
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean check=Isprime(num);
    System.out.println(check);
    
    for(int j=2;j<=500;j++)
    {
        for(int k=j-1;k>1;k--)
        {
            if(j%k!=0)
            {
                System.out.print( j );
                break;
            }
        }
    }
 }

 public static boolean Isprime(int num)
 {
    boolean n=true;
    for(int i=num-1;i>1;i--)
    {
        if(num%i==0)
        {
            n=false;
        }

        else
        {
        n=true;
        }
    }

    return n;
 }
}
