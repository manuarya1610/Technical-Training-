import java.util.Scanner;
public class hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = 0 ;
        System.out.println(":::::::::::::::WELCOME TO THE ARYA HOTEL ::::::::::::::: \n\n");
        while(true){
            System.out.println(":::::::::::::::MENU:::::::::::::::");
            System.out.println("Option 1: Pasta(Rs790)");
            System.out.println("Option 2: Pizza(Rs999)");
            System.out.println("Option 3: Butter Chicken(Rs1500)");
            System.out.println("Option 4: Momos(Rs200)");
            System.out.println("Option 5: Chole Bhature(Rs500)");
            System.out.println("Option 6: DISPLAY BILL");
            System.out.print("Enter your option no. : ");
            int ch = sc.nextInt();
            switch(ch){
                        case 1: System.out.println("\nOrder Received");
                            bill += 790;
                            break;
                        case 2: System.out.println("\nOrder Received");
                          
                            bill += 999;
                            break;
                        case 3: System.out.println("\nOrder Received ");
                            
                            bill += 1500;
                            break;
                        case 4: System.out.println("\nOrder Received ");

                            bill += 200;
                            break;
                        case 5: System.out.println("\nOrder Received ");

                            bill += 500;
                            break;
                        case 6: System.out.print("\nTOTAL BILL: "+bill ); 
                           
                            System.exit(0);
                            break;
                        default:System.out.println("WRONG OPTION!!");
            }

        }

    }
}
