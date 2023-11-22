import java.util.Scanner;

public class Isevenfun {
    
 public static void main(String args[])
 {
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean check=Iseven(num);
    System.out.println(check);
 }

 public static boolean Iseven (int num)
 {
    boolean n=true;
     if(num%2!=0)
     {
        n=false;
     }

     else
     {
        n=true;
     }

     return n;
 }
}
