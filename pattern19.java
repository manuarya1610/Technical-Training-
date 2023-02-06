class pattern19{
public static void main(String args[]){
    int i,j;
    int rows=5;
    for(i=1; i<=rows; i++){
        for(j=i; j<=rows; j++)
        {
            System.out.print("*");
        }
        for(j=1; j<=(2*i-2); j++)
        {
            System.out.print(" ");
        }
        for(j=i; j<=rows; j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    for(i=1; i<=rows; i++){
        for(j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        
        for(j=(2*i-2); j<(2*rows-2); j++)
        {
            System.out.print(" ");
        }
        for(j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        }
    }
}