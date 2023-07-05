 abstract class shape {

    abstract void  cal_area();
    abstract void cal_volume();

}
class sphere extends shape{
    float r;
    sphere(float r)
    {
        this.r=r;
    }
    void cal_area()
    {
        float a = 4*3.14f*r*r;
        System.out.println("area of sphere is ="+a);
    }
    void cal_volume() {
          float v=4/3*3.14f*r*r*r;
        System.out.println("volume of sphere is ="+v);

    }
}

 class cone extends shape{
     double r,h;
     cone(double r,double h)
     {
         this.r=r;
         this.h=h;
     }
     void cal_area()
     {
         double a = 3.14f*r*(r+Math.sqrt(h*h+r*r));
         System.out.println("area of cone ="+a);
     }
     void cal_volume() {
         double v = 3.14f *r*r*h/3;
         System.out.println("volume of cone is ="+v);

     }
 }
 class m{
    public  static void main(String arg[])
    {
        sphere ob = new sphere(3.5f);
        cone ob1 = new cone(2.4,6.7);

        ob.cal_area();
        ob.cal_volume();
        ob1.cal_area();
        ob1.cal_volume();


    }
 }