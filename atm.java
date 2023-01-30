import java.util.Scanner;
public class atm
{
    public static void main(String args[])
    { 
        int accountbalance = 5000, withdrawal, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("::::::::::::::: ATM ::::::::::::::: \n\n");
            System.out.println("Press 1 to Withdraw");
            System.out.println("Press 2 to Deposit");
            System.out.println("Press 3 to Check Balance");
            System.out.println("Press 4 to EXIT");
            System.out.print("Please enter your choice: ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter ampunt to be withdrawn: ");
                withdrawal = sc.nextInt();
                if(accountbalance >= withdrawal)
                {
                    System.out.println("Collect your money!!");
                   accountbalance =accountbalance - withdrawal;
                }
                else
                {
                    System.out.println("Your account balance is insuffcient :(");
                }
                break;
 
                case 2:
                System.out.print("Enter amount to be deposited: ");
                deposit = sc.nextInt();
                accountbalance = accountbalance + deposit;
                System.out.println("Your Money has been deposited successfully!");
                break;
 
                case 3:
                System.out.println("Your current balance is : " + accountbalance);
                break;
 
                case 4:
                System.out.println("BYE!!");
                System.exit(1);
            }
        }
    }
}

