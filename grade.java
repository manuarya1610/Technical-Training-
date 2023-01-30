import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st subject mks: ");
        int mks1 = sc.nextInt();
        System.out.print("\nEnter 2st subject mks: ");
        int mks2 = sc.nextInt();
        System.out.print("\nEnter 3st subject mks: ");
        int mks3 = sc.nextInt();
        double percentage=(mks1 + mks2 + mks3)*100/300;
        
        if((int)percentage>=90)
            System.out.println("Grade is A");
        else if((int)percentage>=70 && (int)percentage<90)
            System.out.println("Grade is B");
        else if((int)percentage>=60 && (int)percentage<70)
            System.out.println("Grade is C");
        else if((int)percentage>=50 && (int)percentage<60)
            System.out.println("Grade is D");
        else
            System.out.println("Grade is F");

        sc.close();
    }
}
