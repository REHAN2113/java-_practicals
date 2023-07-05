import java.util.*;

 class twoDarray
{
     public static void main(String arg[])
       {
          Scanner sc = new Scanner(System.in);
           System.out.println("\n enter limit :");
            int n=sc.nextInt();

          
          int a[][] = new int[n][n];
            int b[][] = new int[n][n];
 int c[][] = new int[n][n];
              
                        int i,j;
                  for(i=0;i<n;i++)
                    {
                   for(j=0;j<n;j++)
              {
                      a[i][j]=sc.nextInt();
              }
}
                  for(i=0;i<n;i++)
                    {
                   for(j=0;j<n;j++)
                 {         
                      b[i][j]=sc.nextInt();
              }
  }
                
              for(i=0;i<n;i++)
           {
              for(j=0;j<n;j++)
           {
                 c[i][j]=a[i][j]+b[i][j];
            }
               
           }
              for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                 {   System.out.print(c[i][j]+"\t");   
                 }
                 System.out.println();
               }
                     
       }
} 