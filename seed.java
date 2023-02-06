import java.util.Scanner;

public class seed {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int x=sc.nextInt();
    System.out.print("\nEnter the second number: ");
    int y=sc.nextInt();
    int dub=x;
    // int checker=x;
    while(dub!=0){
        x*=(dub%10);
        dub/=10;
    }
    if(x==y)
    System.out.println("Its a seed Number!");
    else
    System.out.println("Not a seed Number!");
 }   
}

