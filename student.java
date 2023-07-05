import java.util.*;
public class student {
int sno;
String sname;
int per;
    student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n enter sno =");
        sno=sc.nextInt();
        System.out.println("\n enter sname =");
         sname=sc.next();
        System.out.println("\n enter percentage =");
         per=sc.nextInt();


    }
       static void sort_by_per(student ob[],int n)
       {
           student t;
           for(int pass=1;pass<n;pass++)
           {
               for(int i=0;i<n-pass;i++)
               {
                   if(ob[i].per<ob[i+1].per)
                   {
                       t=ob[i];
                       ob[i]=ob[i+1];
                       ob[i+1]=t;
                   }
               }

           }
       }
       void display(student ob[] ,int n)
       {
           for(int i=0;i<n;i++)
           System.out.println("sno ="+ob[i].sno+"\tsname="+ob[i].sname+"\tper="+ob[i].per);
       }

    public static void main(String arg[])
    {
             Scanner sc = new Scanner(System.in);

             System.out.println("\n enter limit:");
             int n=sc.nextInt();
             student ob[] = new student[n];
             for(int i=0;i<n;i++)
             {
                 ob[i]= new student();
             }
             sort_by_per(ob,n);
             ob[0].display(ob,n);
    }

}
