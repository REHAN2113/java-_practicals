import java.util.*;
abstract class area {
    Scanner sc = new Scanner(System.in);
    abstract void area();

}
class rectangle extends area{

    void area()
    {
        System.out.println("enter lenght :");
        int l = sc.nextInt();
        System.out.println("enter breadth :");
        int b = sc.nextInt();

        int a = l*b;
        System.out.println("area of rectangle :"+a);

    }
}
class triangle extends area{

    void area()
    {
        System.out.println("enter base :");
        int base = sc.nextInt();
        System.out.println("enter height :");
        int height = sc.nextInt();

        int a = base*height;
        System.out.println("area of triangle :"+a);

    }
}

class ab1{
    public static void main(String arg[])
    {
        rectangle ob = new rectangle();
        triangle ob1 = new triangle();

        ob.area();
        ob1.area();

    }
}
