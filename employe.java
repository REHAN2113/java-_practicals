
public class employe {
    static int count=0;
    int eno;
    String ename;
    float sal;
    employe(int eno,String ename,float sal)
    {
         ++count;
         System.out.println("\n object count = "+count);
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;
        System.out.println("\n eno = "+eno);
        System.out.println("\n ename = "+ename);
        System.out.println("\n sal = "+sal);

    }
    public static void main(String arg[])
    {
          employe ob = new employe(101,"rehan",345f);
        employe ob1 = new employe(102,"arshan",555f);
        employe ob2 = new employe(103,"ajim",444f);


    }
}
