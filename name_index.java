import java.awt.*;
import java.util.*;
public class name_index {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String a[] = new String[100] ;
        System.out.println("enter limit");
        int n = sc.nextInt();
        int flag=0,i;
        System.out.println("enter names");
        for (i = 0; i < n; i++)
        {
            a[i]=sc.next();
        }

        System.out.println("enter name to search");
        String s1=sc.next();

        for ( i=0;i<n;i++)
        {
            if(a[i].equals(s1))
            {
                flag=1;
                break;
            }
        }
         if(flag==1)
         {
             System.out.println("postion ="+i);
         }
         else{
             System.out.println("not found");
         }


    }
}
