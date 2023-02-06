import java.util.*;

public class divSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();       
        int dub=num;
       int sum=0;
       while(dub!=0){
        sum+=(dub%10);
        dub/=10;
       }
       if(num%sum==0)
       System.out.println("Its Divisible");
       else
       System.out.println("Not Divisible");
    }   
   }
   