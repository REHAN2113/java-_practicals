import java.util.*;

class sum_even{

    public static void main(String arg[])
{
            int sum=0;
            int a[] = new int[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("\n enter limit :");
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
               a[i]=sc.nextInt();
              }
               for(int i=0;i<n;i++)
            {
                  if(a[i]%2==0)
                  sum=sum+a[i];
           }
              System.out.println("sum of even numbers = "+sum);

}
}