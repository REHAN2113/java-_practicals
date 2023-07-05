import java.util.*;

public class country {

    String country;
    Scanner sc = new Scanner(System.in);
    void accepteC()
    {
        System.out.println("\n enter country name ");
        country=sc.next();
    }


}
  class state1 extends  country{

    String state;
    void accepteS()
    {
        System.out.println("enter state:");
        state=sc.next();

    }

}
    class city extends state1{

      String city;
      void accepteCity(){

          System.out.println("\n enter city name:");
          city=sc.next();

      }
         void display()
         {
             System.out.println("\n country:"+country);
             System.out.println("\n state:"+state);
             System.out.println("\n city:"+city);
         }
      public static void main(String arg[])
      {
          city ob = new city();
          ob.accepteC();
          ob.accepteS();
          ob.accepteCity();
          ob.display();
      }


}
