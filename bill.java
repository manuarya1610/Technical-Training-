import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of consumed unit: ");
        int unit = sc.nextInt();
        double amt=0,surcharge=0;

        if(unit<200)
            amt=unit*1.20;
        else if(unit>=200 && unit<400)
            amt=199*1.20+(unit-199)*1.50;
        else if(unit>=400 && unit < 600)
            amt=199*1.20+200*1.50 +(unit-399)*1.80;
        else
            amt=199*1.20+200*1.50 +200*1.80+(unit-599)*2.0;

        if(amt>400)
            surcharge=amt*0.15;
            System.out.println("The Net amount is Rs"+(float)(amt+surcharge));
        sc.close();
    }
}
