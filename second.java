class sumdigit{

  public static void main(String arg[])
{
          int n=1234;
          int sum=0;
          while(n>0)
        {
           int d=n%10;
           sum=sum+d;
           n=n/10;
    
        }
            System.out.println("sum of digit ="+sum);
           
}      
}