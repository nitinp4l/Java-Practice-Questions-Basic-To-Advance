public class JB_09_greatest_no_among_three_no {
    public static void main(String[] args) {
        int a=10;
        int b=31;
        int c=5;
        System.out.println("the greeatest no among three no :");
        if(a>=b &&a >=c)
            System.out.println(a+" Is the greatest among all three is a");
        else if (b>=a && b>=c)
        {
            System.out.println(b+" :Is the greatest no among all is b");
        } else if (c>=a && c>=b) {
            System.out.println(c+" :Is the egreatest no among all no is c");

        }
    }
}
