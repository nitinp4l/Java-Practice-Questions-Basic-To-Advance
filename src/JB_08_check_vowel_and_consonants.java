import java.util.Scanner;

public class JB_08_check_vowel_and_consonants {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter any alphabet :");
        char ap = a.next().toLowerCase().charAt(0);
        if (ap =='a' || ap =='e' || ap =='i' || ap =='o' || ap =='u')
            System.out.println(ap +" : The alphabet is vowel");
        else
            System.out.println(ap +" : The alphabet is consonant");
    }
}
