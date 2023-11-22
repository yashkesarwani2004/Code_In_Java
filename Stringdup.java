import java.util.Scanner;

public class Stringdup {
    
 public static void main(String args[])
 {
    System.out.println("Enter string:");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    for(int i=0;i<str.length();i++)
    {
         
         System.out.println(str.charAt(i));
    }
 }
}
