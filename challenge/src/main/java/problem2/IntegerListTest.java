package problem2;

import java.util.Scanner;
public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
// Create a list, then repeatedly print the menu and do what the
// user asks until they quit
//-------------------------------------------------------
    public static void main(String[] args)
    {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    //--------------------------------------
// Do what the menu item calls for
//--------------------------------------
    public static void dispatch(int choice)
    {
        int loc;
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();
                break;
            case 2:
                System.out.println("Enter the value you want to add: ");
                int value = scan.nextInt();
                list.addElement(value);
                break;
            case 3:
                System.out.println("Enter the value you want to remove: ");
                int rm_first_val = scan.nextInt();
                list.removeFirst(rm_first_val);
                break;
            case 4:
                System.out.println("Enter the value you want to remove: ");
                int rm_val = scan.nextInt();
                list.removeAll(rm_val);
                break;
            case 5:
                list.print();
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    //----------------------------
// Print the user's choices
//----------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Add element to the list: ");
        System.out.println("3: Remove the first occurrence of an element from the list: ");
        System.out.println("4: Remove all occurrences of an element from the list: ");
        System.out.println("5: Print the list");
        System.out.print("\nEnter your choice: ");
    }
}
