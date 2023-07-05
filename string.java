import java.util.*;

class strings{

           public static void main(String arg[])

{               

              Scanner sc = new Scanner(System.in);
            System.out.println("\n enter name ");
             String s3=" ";
            StringBuffer  sbr = new StringBuffer(s3); 
            String s1=sc.nextLine();
              for(int i=0;i<s1.length();i++)
            {
                char ch=s1.charAt(i);

              if(Character.isUpperCase(ch))
              {  
                 ch=Character.toLowercase(ch);
              sbr.append(ch);
               }       
               if(Character.isLowerCase(ch))
              {  
                 ch=Character.toUppercase(ch);
              sbr.append(ch);
               }       
                     
                                         
           }
            System.out.println(sbr);

}




}