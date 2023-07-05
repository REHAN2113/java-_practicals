import java.util.*;
public class doctor {
    int dno;
    String dname,qualification,specialiazation;
    void accepte()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dno");
        dno=sc.nextInt();
        System.out.println("enter dname");
        dname=sc.next();
        System.out.println("enter qualification");
        qualification=sc.next();
        System.out.println("enter specialiaztion");
        specialiazation=sc.next();

    }
    void display_sort(doctor ob[],int n)
    {
        doctor t;
        for(int pass =1;pass<n;pass++)
        {
            for (int i=0;i<n-pass;i++)
            {
                if(ob[i].dname.compareTo(ob[i+1].dname)>0)
                {
                    t=ob[i];
                    ob[i]=ob[i+1];
                    ob[i+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("dno="+ob[i].dno);
            System.out.println("dname="+ob[i].dname);
            System.out.println("qualification="+ob[i].qualification);
            System.out.println("specialiazation="+ob[i].specialiazation);
        }
    }
    public static void main(String arg[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();

        doctor ob[] = new doctor[100];
        for(int i=0;i<n;i++)
        {
            ob[i] = new doctor();
            ob[i].accepte();
        }
        ob[0].display_sort(ob,n);
    }

}
