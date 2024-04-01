public class JB_06_swap_two_numbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("new value of a is :"+a);
        System.out.println("new value of b is :"+b);
    }
}
