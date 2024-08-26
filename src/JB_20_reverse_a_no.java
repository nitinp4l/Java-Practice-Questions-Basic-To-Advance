import java.util.Scanner;

public class JB_20_reverse_a_no {
    public static void main(String[] args) {
        int a,reversed=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any 2 or more digit no :");
                int num =scanner.nextInt();

        while (num != 0)
        {
             a=num%10;
            reversed=reversed*10+a;
            num/=10;

        }
        System.out.println("the reverse nonis "+reversed);


    }
}
