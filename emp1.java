import java.util.*;
class emp{

             int eno,sal;
             String ename;
             

             void accepte()
            {
                Scanner sc = new Scanner(System.in);
                  
                System.out.println("\n enter eno =");
                eno=sc.nextInt();
                System.out.println("\n enter ename =");
                ename=sc.next();
                System.out.println("\n enter sal ="); 
                sal=sc.nextInt(); 

            }
            
            void display()
          {
                System.out.println("\n eno ="+eno);
                 System.out.println("\n  ename ="+ename);
                 System.out.println("\n  sal ="+sal);
 
 
          }
           
           public static void main(String arg[])
          {


                 
                 
                   emp ob[] =new emp[100];
                 
                    int n=0,id,f=0,ch,i;
                   Scanner sc = new Scanner(System.in);
                   do{
                   System.out.println("\n 1 -accepte \n 2 - display \n 3 - search by id ");
                   System.out.println("\n enter choice :");
                    ch=sc.nextInt();
                   
                    switch(ch)
                {
                            case 1 : System.out.println("\n enter limit :");  
                                     n=sc.nextInt();
                                     for(i=0;i<n;i++)
                                    {
                                        ob[i] = new emp();
                                        ob[i].accepte();
                                    }
                                     break;
                            case 2 : for(i=0;i<n;i++)
                                      {
                                           ob[i].display();
                                             }
                                       break;
                            case 3 : System.out.println("\n enter id to search = ");
                                     id=sc.nextInt();
                                     for(i=0;i<n;i++)
                                      {
                                        if(ob[i].eno==id)
                                     {
                                          f=1;
                                          break;
                                     }
                                 
                                      }
                                       if(f==1)
                                         {
                                            ob[i].display();
                                           }
                                      else {
                                         System.out.println("\n not found");

                                               } 
                                         break;
                                 }
                  }while(ch<4);
} 

}
            


          
             