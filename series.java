import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s =0;
        System.out.println("Enter a no: ");
        double n =sc.nextInt();
        for(double i =1; i<=n;++i){
            s += 1.0/i;
        }
        System.out.println("The sum is: "+s);
    }
}
