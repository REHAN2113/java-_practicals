import java.util.*;
public class cricket_player {
    String name;
    int no_of_innings;
    int no_of_time_not_out;
    int total_runs;
    int bat_avg;
   static int j=0;
    static int a[] = new int[100];
              void accepte()
              {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("\n enter player name=");
                  name=sc.next();
                  System.out.println("\n enter no of innings=");
                  no_of_innings=sc.nextInt();
                  System.out.println("\n enter not outs=");
                  no_of_time_not_out=sc.nextInt();
                  System.out.println("\n enter total runs=");
                  total_runs=sc.nextInt();
                  System.out.println("\n enter player avg=");
                  bat_avg=sc.nextInt();

                  a[j++]=total_runs/no_of_innings;
              }

           static void sort(cricket_player ob[],int n,int a[])
           {
                cricket_player t;
                int p;
               for(int pass=1;pass<n;pass++)
               {
                    for (int i=0;i<n-pass;i++)
                    {
                        if(a[i]<a[i+1])
                        {
                            t=ob[i];
                            ob[i]=ob[i+1];
                            ob[i+1]=t;

                            p=a[i];
                            a[i]=a[i+1];
                            a[i+1]=p;

                        }
                    }
               }
               for(int i=0;i<n;i++)
               {
                   System.out.println("batting_avg = "+a[i]+"\t name = "+ob[i].name+"\t no_of_inninigs = "+ob[i].no_of_innings+" \t not outs = "+ ob[i].no_of_time_not_out+" \t total_runs = "+ ob[i].total_runs+"\t avg = "+ob[i].bat_avg);
               }
           }

           public static void main(String arg[])
           {
                Scanner sc = new Scanner(System.in);
                cricket_player ob[] = new cricket_player[100];

                System.out.println("\n enter limit :");
                int n=sc.nextInt();
                for(int i=0;i<n;i++)
                {
                    ob[i] = new cricket_player();
                    ob[i].accepte();
                }
                sort(ob,n,a);
           }
}
