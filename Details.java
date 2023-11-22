import java.util.Scanner;

public class Details {

    public static void main(String args[]) {
        try (Scanner Det = new Scanner(System.in)) {
            System.out.println("Enter your Name");
            String name = Det.nextLine();
            System.out.println("Enter your gender");
            String gender = Det.nextLine();
            System.out.println("Enter your Number");
            long number = Det.nextLong();
            System.out.println("Enter your Age");
            int Age = Det.nextInt();
            System.out.println("Enter your CGPA");
            float CGPA = Det.nextFloat();
            System.out.println("Name:" + name);
            System.out.println("Gender:" + gender);
            System.out.println("Number:" + number);
            System.out.println("Age:" + Age);
            System.out.println("CGPA:" + CGPA);
        }
    }
}
