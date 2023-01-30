import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ps = 0;
        int os = 0;
        while(n!=0){
            if( n%2==0){
                ps = ps + n%10;
            }
            
            else
                os = os + n%10;

            n = n/10;
        }
        System.out.println("Prime Sum: "+ps);
        System.out.println("Odd Sum: "+os);
    }
}
