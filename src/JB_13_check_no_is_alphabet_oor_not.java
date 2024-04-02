import java.util.Scanner;

public class JB_13_check_no_is_alphabet_oor_not {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any alphabet :");
        char alphabet= scanner.next().toLowerCase().charAt(0);
        if ((alphabet>='a') && (alphabet<='z'))
            System.out.println(alphabet+" :is alphabet");
        else
            System.out.println(alphabet+" : is not an alphabet");
    }
}
