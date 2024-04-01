import java.util.Scanner;
public class JB_01_input_a_integer {
    public static void main(String[] args) {
        // by static method
        int n=10;
        System.out.println("entered no is:"+n);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("The number you entered is: " + number);
    scanner.close();
    }
}
