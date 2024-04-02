import java.util.Scanner;

public class JB_11_check_leapyear {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number :");
        int n= scanner.nextInt();
        if(n%4==0 || n%100==0 || n%400==0)
        {
            System.out.println("enter year is a leap year..");
        }
        else
            System.out.println("entered year is not a leap year...");
    }
}
