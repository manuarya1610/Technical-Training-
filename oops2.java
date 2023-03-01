public class oops2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.takeInput(21, "Arya", 90, 100, 99);
        s1.getGrade();
        s1.printReport();
    }
}

class Student{
    private int roll;
    private String name;
    private int subject1;
    private int subject2;
    private int subject3;
    private char grade;

    public void takeInput(int roll,String name,int subject1, int subject2,int subject3){
        this.name=name;
        this.roll=roll;
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    public double Percentage(){
        double percent=((subject1+subject2+subject3)*100)/300;
        return percent;
    }
    public void getGrade(){
        if(Percentage()>90)
        grade='A';
        else if(Percentage()<90 && Percentage()>=70)
        grade='B';
        else if(Percentage()<70 && Percentage()>=60)
        grade='C';
        else if(Percentage()<60 && Percentage()>=50)
        grade='D';
        else
        grade='F';
    }
    public void printReport(){
        System.out.println("Name of Student--"+name);
        System.out.println("Roll Number--"+roll);
        System.out.println("Subject One--"+subject1);
        System.out.println("Subject Two--"+subject1);
        System.out.println("Subject Three--"+subject1);
        System.out.println("Percentage--"+Percentage());
        System.out.println("Grade--"+grade);
    }
}

