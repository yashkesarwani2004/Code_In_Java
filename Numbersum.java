import java.util.Scanner;

public class Numbersum {
    

 public static int fun(int S,int E)
 {
    int sum=0;
    for(int i=S;i<=E;i++)
    {
        sum=sum+i;
    }
    return sum;
 }

 public static void main(String args[])
 {
     System.out.println("Enter the value of Start and end:");
     Scanner sc = new Scanner(System.in);
     int S = sc.nextInt();
     int E = sc.nextInt();
     int num=fun(S, E);
 }
}



