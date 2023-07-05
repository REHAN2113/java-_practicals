import java.util.*;
public class email {

    public static void main(String arg[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n enter email");
        String s1=sc.next();
        int flag=0;
        int flag1=1;
        for(int i=0;i<s1.length();i++)
        {
               if(s1.charAt(i)=='@')
               {
                   flag=1;
               }
               if(Character.isDigit(s1.charAt(0)))               {
                  flag1=0;
               }


        }
         if(flag==1 && flag1==1)
         {
             System.out.println("\n email is valid ");

         }
         else{
             System.out.println("\n email is not valid ");
         }

    }
}
