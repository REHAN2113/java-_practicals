// accept doctor info and display in ascending order by name
import java .util.*;
class d
{
    int dno;
    static String dname,qualification,s1;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr dno:-");
        dno=sc.nextInt();
        System.out.print("Enetr dname:-");
        dname=sc.next();
        System.out.print("Enetr qualification:-");
        qualification=sc.next();
    }
    static void sort(d ob[],int n)
    {
        int pass,i;
        d t;
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {

                if(ob[i].dname.compareTo(ob[i+1].dname)>0)
                {
                    t=ob[i];
                    ob[i]=ob[i+1];
                    ob[i+1]=t;
                }
            }
        }

    }
    void disp()
    {
        System.out.println(dno+"\t"+dname+"\t"+qualification);
    }
    public static void main(String a[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr limit :-");
        n=sc.nextInt();
        d ob[]=new d[n];
        for(i=0;i<n;i++)
        {
            ob[i]=new d();
            ob[i].accept();
        }
        sort(ob,n);
        for(i=0;i<n;i++)
            ob[i].disp();
    }
}