public class JB_17_Fabonnaci_series {
    public static void main(String[] args) {
        int i,first=0,second=1,next;
        int n=10;
        for(i=0;i<=n;++i)
        {
           next=first+second;
           first=second;
           second=next;
            System.out.println("the fibnacci series is "+next);
        }
    }
}
