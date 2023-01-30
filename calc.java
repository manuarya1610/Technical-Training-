import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Option 1 for Cube");
            System.out.println("Option 2 for Abs");
            System.out.println("Option 3 for Power ");
            System.out.println("Option 4 to convert Decimal to Binary");
            System.out.println("Option 5 to convert Binary to Decimal");
            System.out.println("Option 6 to convert Binary to Octal");
            System.out.println("Option 7 to convert Binary to Hexadecimal");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter a number: ");
                int n1 = sc.nextInt();
                System.out.println("The cube of the number is: "+Math.pow(n1,3));
                break;
                case 2:System.out.println("Enter a number: ");
                int n2 = sc.nextInt();
                System.out.println("The absolute of a number is: "+Math.abs(n2));
                break;
                case 3:System.out.println("Enter a number: ");
                int n3 = sc.nextInt();
                System.out.println("Enter the power of number: ");
                int p = sc.nextInt();
                System.out.println("The power of a number is: "+Math.pow(n3,p));
                break;
                case 4:System.out.println("Enter a number in decimal: ");
                int n4 = sc.nextInt();
                System.out.println("Decimal to Binary is: "+Integer.toBinaryString(n4));
                break;
                case 5:System.out.println("Enter a number in binary: ");
                String n5 = sc.next();
                System.out.println("Binary to Decimal is: "+Integer.parseInt(n5,2));
                break;
                case 6:System.out.println("Enter a number in binary: ");
                String n6 = sc.next();
                System.out.println("Binary to octal is: "+Integer.toHexString(Integer.parseInt(n6,2)));
                break;
                default:System.out.println("Wrong Choice!!");
            }

        }
}
