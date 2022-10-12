package ie.atu.week4;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args)
        {
            int x, y, sum;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            x = sc.nextInt();
            System.out.print("Enter the second number: ");
            y = sc.nextInt();

            sum = add(x,y);

           System.out.println("Input your first number");
           Scanner inputs = new Scanner(System.in);
           int firstNumber = inputs.nextInt();

           System.out.println("Input your second number");
           int secondNumber = inputs.nextInt();
           Multiply(firstNumber,secondNumber);
    }

        public static void Multiply(int firstNumber,int secondNumber){
            int total = firstNumber * secondNumber;
            System.out.println("The total number is " + total);
        }

    public static int add(int a, int b)
    {
        int sum = a + b;
        System.out.print(a + " + " + b + " = " + sum);
        return sum;
    }
}
