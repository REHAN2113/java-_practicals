public class super1 {

  super1(int x ,int y)
    {
        System.out.println("addition 1 = "+(x+y));
    }


}
class b extends  super1{


        b(int x,int y)
       {
           super(x,y);
           System.out.println("addition 2 = "+(x+y));

       }


}
class c{
    public static void main(String arg[])
    {
        b ob = new b(11,22);


    }
}
