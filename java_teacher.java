import java.util.*;
public class java_teacher {

    int tid,sal;
    String tname,desigination,subject;

    void accepet()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("tID=");
        tid=sc.nextInt();
        System.out.println("tname=");
        tname=sc.next();
        System.out.println("desigination=");
        desigination=sc.next();
        System.out.println("subject=");
        subject=sc.next();
        System.out.println("salary=");
        sal=sc.nextInt();


    }
     void display(java_teacher ob[],int n)
     {
         for(int i=0;i<n;i++)
         {
             if(ob[i].subject.equalsIgnoreCase("java"))
             {
                 System.out.println("tid="+ob[i].tid);
                 System.out.println("tname="+ob[i].tname);
                 System.out.println("desigination="+ob[i].desigination);
                 System.out.println("salary="+ob[i].sal);
                 System.out.println("subject="+ob[i].subject);
             }
         }
     }
     public static void main(String arg[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter limit ");
         int n=sc.nextInt();
         java_teacher ob[] = new java_teacher[100];

         for(int i=0;i<n;i++)
         {
             ob[i] = new java_teacher();
             ob[i].accepet();

         }
          ob[0].display(ob,n);

     }

}
