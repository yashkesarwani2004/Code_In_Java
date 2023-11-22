import java.util.Scanner;

public class Array1 {
    
 public static void main(String args[])
 {
    System.out.println("Enter the size of aaray");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];
    for(int j=0;j>N;j++)
    {
        System.out.println("Enter the values of arrY:");
         arr[j]= sc.nextInt();
        System.out.println(arr[j]);
    }
 }
}
