package ie.atu.week4;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args)
            {
            int sum, firstinput,secondinput;

            //ADD Corey


            //Multiply Lorcan


            //Delete Niall

            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter two numbers");
            firstinput = sc.nextInt();
            secondinput = sc.nextInt();
            sum = delete(firstinput, secondinput);
            System.out.println(sum);



        }
    public static int delete(int x, int y) {
        int sum;
        sum = x-y;
        return sum;
    }
}
