import java.util.Scanner;

public class product {

    int pid,price,qty;
    String name;
    void accepte()
    {
        Scanner sc= new  Scanner(System.in);
        System.out.println("enter pid ");
        pid=sc.nextInt();
        System.out.println("enter name ");
        name=sc.next();
        System.out.println("enter price ");
        price=sc.nextInt();
        System.out.println("enter qty ");
        qty=sc.nextInt();

    }
       void calculate(product ob[],int n)
       {
           int total=0;
           for(int i=0;i<n;i++)
           {
               total=total+(ob[i].price*ob[i].qty);
           }
           for(int i=0;i<n;i++) {
               System.out.println("pid="+ob[i].pid);
               System.out.println("name="+ob[i].name);
               System.out.println("price="+ob[i].price);
               System.out.println("qty="+ob[i].qty);

           }
           System.out.println("total amount="+total);
       }
    public static  void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        product ob[] = new product[100];
        for(int i=0;i<n;i++)
        {
            ob[i]=new product();
            ob[i].accepte();
        }
        ob[0].calculate(ob,n);
    }

}
