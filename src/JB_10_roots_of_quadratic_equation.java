public class JB_10_roots_of_quadratic_equation {
     public static void main(String[] args) {
          double a=1.2,b=2.4,c=3.2;
          double root1,root2;
     //the 1 equation is bsquare -4ac
          double diternment=b*b-4*a*c;
     //if ditenrnment is greater than 0 then...
          if (diternment >0)
          {
               root1=(-b + Math.sqrt(diternment))/(2*a);
               root2=(-b - Math.sqrt(diternment))/(2*a);
               System.out.println("root 1 is: "+root1 +"root 2 is :"+root2);
          }
          //if  diternment is equal to zero then...
          else if (diternment==0)
          {
            root1= root2=-b/(2*a);
               System.out.println("the value of root1=root2=-b/(2*a)");
          }
          else {
               double real = -b / (2 * a);
               double imagenary = Math.sqrt(-diternment) / (2 * a);
               System.out.format("root1 = %.2f-%.2fi", real, imagenary);
               System.out.format("\nroot1 = %.2f+%.2fi", real, imagenary);
          }
     }
}
