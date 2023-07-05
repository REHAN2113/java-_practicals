public class second_smallest {

    public static void main(String arg[])
    {
          int a[]={0,32,11,44,28,9,7};


        int min=a[0];
       for(int i=0;i<a.length;i++)
       {
                  if(a[i]<min) {
                      min = a[i];
                  }
       }
          int min1;
       if(a[0]!=min)
       {
           min1=a[0];
       }
       else{
           min1=a[1];
       }
         for (int i=0;i<a.length;i++)
         {
             if(a[i]<min1 && a[i]!=min)
             {
                 min1=a[i];
             }
         }
           System.out.println("second smallest="+min1);
    }
}
