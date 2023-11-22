import java.util.Scanner;

public class Evensum {

    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int i = 0, sum = 0;
        while (i < num) {
            if (num % 2 == 0) {
                sum = num + sum;
            }
            num--;
        }

        System.out.println("The sum is:" + sum);
    }
}
