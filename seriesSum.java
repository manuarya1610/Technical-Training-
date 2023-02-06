import java.util.Scanner;
public class seriesSum {
    public static void main(String[] args) {
        Scanner I=new Scanner(System.in);
        System.out.print("Enter the number you want to sum upto: ");
        int n=I.nextInt();
        double sum=0;
for (int i = 1; i <= n; i++) {
    sum+=(1/i);
}
I.close();
System.out.println("The sum is : "+sum);
    }
}
