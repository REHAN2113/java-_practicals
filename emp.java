 import  java.util.*;
class emp{

    int eno,sal;
    String ename;
    
    void accepte()
{ 

       Scanner sc = new Scanner(System.in);

       System.out.println("enter eno =");
      
        eno=sc.nextInt();
              System.out.println("enter ename =");
                    ename=sc.next();
              System.out.println("enter sal =");
                      sal=sc.nextInt();
}
 void display()
{           System.out.println("eno ="+eno);
System.out.println("ename ="+ename);
System.out.println(" sal ="+sal);

}
 public static void main(String arg[])
{
           emp ob =new emp();
           ob.accepte();
           ob.display();

}
}