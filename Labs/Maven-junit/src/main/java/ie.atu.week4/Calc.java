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
            sum = sub(x,y);
            sum = multiply(x,y);
            sum = devide(x,y);
    }

    public static int multiply(int a, int b){
        int sum = a * b;
        System.out.print(a + " * " + b + " = " + sum);
        return sum;
    }

    public static int add(int a, int b)
    {
        int sum = a + b;
        System.out.print(a + " + " + b + " = " + sum);
        return sum;
    }

    public static int sub(int a, int b)
    {
        int sum = a - b;
        System.out.print(a + " - " + b + " = " + sum);
        return sum;
    }

    public static int divide(int a, int b)
    {
        int sum = a / b;
        System.out.print(a + " / " + b + " = " + sum);
        return sum;
    }
}
