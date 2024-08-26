public class JB_19_countnumber_of_digit {
  public static void main(String[] args) {
        int i=0,n=1234;
        while(n!=0){
            n/=10;
            i++;
        }

            System.out.print("number of digit :" + i);

    }
}
