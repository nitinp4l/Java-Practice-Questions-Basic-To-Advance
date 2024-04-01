import java.util.Scanner;


public class JB_02_add_two_integer {
    public static void main(String[] args) {
        int a=15;
        int b=67;
        int sum = a+b;
        System.out.println(a+"+"+b+"="+sum);
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number A:");
        int number_A = scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("enter number B:");
        int number_B = scanner1.nextInt();
        int xyz=number_A+number_B;
        System.out.println("sum of the number :"+number_A+"+"+number_B+"="+xyz);
        scanner.close();

    }
}
