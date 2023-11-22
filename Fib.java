import java.util.Scanner;

public class Fib {

    public static void main(String args[]) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print("0");
        System.out.print("1");
        for (int i = 0; i < num - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c);
        }
    }
}