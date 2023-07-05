import java.util.*;
public class frequancy {


    public static void main(String arg[]) {

        String s1;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        s1 = sc.next();
        char array[] = new char[s1.length()];
        int count, i;
        int visited[] = new int[s1.length()];
        for (i = 0; i < s1.length(); i++) {
            array[i] = s1.charAt(i);
            visited[i]=0;
        }

        for (int pass = 0; pass < s1.length(); pass++) {
                  count=0;
            for (i = 0; i < s1.length(); i++) {
                if (s1.charAt(pass) == array[i]&&visited[i]!=1) {
                    count++;
                    visited[i]=1;
                }
            }
             if(count>0)
             System.out.println("count of "+array[pass]+"="+count);
        }
    }
}
