import java.util.*;
public class cricket_player2 {
    String name;
    int no_of_innings;
    int no_of_time_not_out;
    int total_runs;
    int bat_avg;
    static int j=0;
    static int a[] = new int[100];
    int index;
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
          void maximum(cricket_player2 ob[],int n,int a[])
          {

              int max_avg=a[0];
              for(int i=0;i<n;i++)
              {
                  if(a[i]>max_avg)
                  {

                      index=i;

                  }
              }


              System.out.println("name="+ob[index].name);
              System.out.println("total runs="+ob[index].total_runs);
              System.out.println("innings="+ob[index].no_of_innings);
              System.out.println("not outs="+ob[index].no_of_time_not_out);
              System.out.println("avg="+a[index]);

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
        ob[0].maximum(ob,n,a);
    }
}
