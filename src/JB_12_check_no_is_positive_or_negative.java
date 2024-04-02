import java.util.Scanner;

public class JB_12_check_no_is_positive_or_negative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter any no:");
        int n= scanner.nextInt();
        if (n>=0)
            System.out.println(n+" No is positive...");
        else
            System.out.println(n+"  No is negative.... ");
    }
}
