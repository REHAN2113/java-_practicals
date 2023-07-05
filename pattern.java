public class pattern {

    public static void main(String arg[]) {
        int n=5;
        int t=5;

           for(int i=0;i<n;i++) {
               for (int j = 1; j <= 50-i; j++) {

                   if (j < t) {
                       System.out.print("\t");
                   } else {
                       System.out.print("*");
                   }


               }
               t--;
               System.out.println();
           }






    }
}
