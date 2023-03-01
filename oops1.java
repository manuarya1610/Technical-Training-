public class oops1 {
    public static void main(String[] args) {
        emp emp1=new emp();
        emp1.takeEmployeeInput(7,"Manu Arya", 9000000);
        emp1.printSalary();
    }
}

class emp{
    private int  id;
    private  String name;
    private int b_salary;
    private double amount;
     
    public void takeEmployeeInput(int id,String name,int b_salary){
        this.id=id;
        this.name=name;
        this.b_salary=b_salary;
    }
    
    public void allAllowance(){
        double HRA=0.5*b_salary;
        double TA=0.3*b_salary;
        double MA=0.25*b_salary;
        double PF=0.1*b_salary;
        double g_Salary=b_salary+HRA+TA+MA;
    }
    
    public int annualSalaryCalculator(){
        return 12*b_salary;
    }
    
    public void taxCalculator(){
        int annualSalary=annualSalaryCalculator();
        if(annualSalary>500000)
        amount=(annualSalary*90)/100;
        else if(annualSalary>700000)
        amount=(annualSalary*80)/100;
        else if(annualSalary>900000)
        amount=(annualSalary*70)/100;
    }
    
    public void printSalary(){
       System.out.println("Name: "+name);
       System.out.println("Id: "+id);
       System.out.println("Amount: "+amount);
    }
    }

    