import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        int temp = n;
        int arm = 0; 
        while(n!=0){
            arm += (n%10)*(n%10)*(n%10);
            n /= 10;
        }
        if(arm == temp)
        System.out.println("The number is armstrong!");
        else
        System.out.println("The number is not armstrong!");
    }
}
