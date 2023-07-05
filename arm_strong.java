import java.util.*;

class arm_strong{
    public static void main(String arg[])
{
          
            int  j=0,num,num1,sum,n,d=0;

            Scanner sc = new Scanner(System.in);
            System.out.println("\n enter limit :");
             n=sc.nextInt();
            int a[] = new int[5];
            for(int i=0;i<n;i++)
            {
                num=sc.nextInt();
                sum=0;
                  num1=num;
                 while(num>0)
                  {
                           d=d+num%10;
                          sum=sum+d*d*d;
                          num=num/10;
                 }
                   if(num1==sum)
                   {
                      a[j++]=num1;

                   }
                     
              }
for(int i=0;i<j;i++)
{
   System.out.println(a[i]);
}

       
}
}