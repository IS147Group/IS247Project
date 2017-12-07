import java.util.Date;
import java.util.Scanner;

/**
 * Created by SahilPatel on 12/7/17.
 */
public class Main {
    public static void main(String args[])
    {
        int choice=0;


        Bank b = new Bank();
        System.out.println(new Date());

        do
        {
            System.out.println("Please select and option below or Enter 5 to exit ...");
            System.out.println("1) Create New Account ");
            System.out.println("2) Display Account Details ");
            System.out.println("3) Deposit...");
            System.out.println("4) Withdraw...");
            System.out.println("5) Exit");
            System.out.print("Enter your choice :  ");

            try{
                Scanner input = new Scanner(System.in);
                choice=input.nextInt();

                switch(choice)
                {
                    case 1 :  //New Account
                        b.newEntry();
                        break;
                    case 2 :  //Displaying Record Details
                        b.display();
                        break;
                    case 3 : //Deposit...
                        b.deposit();
                        break;
                    case 4 : //Withdraw...
                        b.withdraw();
                        break;
                    case 5  :  System.out.println("\n\n.....THANKS FOR USING BANKING $Y$TEM.....");
                        break;
                    default : System.out.println("\nInvalid Choice \n\n");
                }
            }
            catch(Exception e)
            {}
        }while(choice!=5);
    }
}
