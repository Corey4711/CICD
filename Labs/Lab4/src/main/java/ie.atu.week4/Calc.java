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

            //Multiply Lorcan


            //Delete Niall
        }

    public static int add(int a, int b)
    {
        int sum = a + b;
        System.out.print(a + " + " + b + " = " + sum);
        return sum;
    }
}
