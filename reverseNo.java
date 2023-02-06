import java.util.*;

public class reverseNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();        
        int sum=0;
        while(num!=0){
          sum=(sum*10)+(num%10);
          num/=10;
        }
        System.out.println(sum);
    }
}

