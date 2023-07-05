import java.util.*;
abstract public class shape1 {
    abstract  void area();
    Scanner sc = new Scanner(System.in);
}
class rectangle1 extends shape1
{
    void area()
    {
        System.out.println(" enter lenght");
        double l = sc.nextDouble();
        System.out.println("enter breadth");
        double b = sc.nextDouble();
        double a=l*b;
        System.out.println("area of rectangle "+a);
    }

}
  class demo{
    public static void main(String arg[])
    {
        rectangle1 ob = new rectangle1();
        ob.area();
    }
  }
