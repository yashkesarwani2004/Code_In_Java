import java.util.Scanner;

public class Fac {

    public static void main(String args[]) {
        int sum = 1;
        System.out.println("Enter the number");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        for (int i = num; i > 0; i--) {
            sum = i * sum;
        }

        System.out.println("Factorial of given number is :" + sum);
    }
}
