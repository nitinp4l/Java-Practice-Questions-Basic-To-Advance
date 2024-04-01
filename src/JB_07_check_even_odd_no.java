import java.io.InputStream;
import java.util.Scanner;

public class JB_07_check_even_odd_no {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter any no :");
        int number = n.nextInt();
        if (number%2==0)

            System.out.println(number  +"  The  no is even...");
        else
            System.out.println(number +"  The  no is odd...");

    }
}
