import java.util.*;
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Basic Salary: ");
        int basicsalary=sc.nextInt();
        double hra=0.5*basicsalary;
        double ta=0.3*basicsalary;
        double ma=0.25*basicsalary;
        double pf=0.1*basicsalary;
        double gs=basicsalary+hra+ta+ma;
        double tax=0.1*gs;
        double ns=gs-tax-pf;
        System.out.println("--------------Arya Industries--------------");
        System.out.println("\n------Salary Slip for Jan 2023------");
        System.out.println("\nBasic Salary --> "+basicsalary);
        System.out.println("\nHouse Rent Allowance --> "+hra);
        System.out.println("\nConveyance Allowance --> "+ta);
        System.out.println("\nMedical Allowance --> "+ma);
        System.out.println("\nProfessional Tax --> "+pf);
        System.out.println("\nGross Salary --> "+gs);
        System.out.println("---------------------------------------------");
        System.out.println("\nNET PAY --> "+ns);
    }
}
