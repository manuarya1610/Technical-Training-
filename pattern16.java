public class pattern16
{
    public static void main(String[] args)
    {
        int rows = 5;
        for (int i= rows-1; i>= 0; i--)
        {
            for (int j=i; j>=0; j--)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        for (int i=0; i<= rows-1; i++)
        {
            for(int j=i; j >= 0;j--)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }
}