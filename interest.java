import java.util.Scanner;
    public class interest{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the principal: ");
            int principle=sc.nextInt();
            System.out.print("\nEnter your rate of Interest: ");
            int roi=sc.nextInt();
            System.out.print("\nEnter the amount of time: ");
            int time=sc.nextInt();
            int si=(principle*time*roi)/100;
            System.out.println("\nYour Simple Interest is: "+si);
            sc.close();
        }
    }