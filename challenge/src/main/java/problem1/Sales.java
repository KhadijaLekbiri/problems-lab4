package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        int sum, max, min, val, num = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of sales people :");

        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;max = sales[0];min = sales[0];
        for (int i=0; i<sales.length; i++)
        {
            if (max < sales[i]){
                max = sales[i];
            }
            if (min > sales[i]){
                min = sales[i];
            }
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + sum/SALESPEOPLE);
        System.out.println("The maximum sale: " + max);
        System.out.println("The minimum sale: " + min);

        System.out.print("\nEnter a value :");
        val = scan.nextInt();

        for (int i=0; i<sales.length; i++) {
            if (sales[i] >= val){
                num++;
                System.out.println(" " + (i+1) + " " + sales[i]);
            }
        }
        System.out.println("The number of salespeople whose sales exceeded the value "+val+" is :" + num);
    }
}