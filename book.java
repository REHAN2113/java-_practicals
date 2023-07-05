class book{

  int bno,price,quantity,total;
   String bname,author;

     void accepte(int bno1, int price1,int quantity1,String bname1 ,String author1)
{
      bno=bno1;
      price=price1;
      quantity=quantity1;
      bname=bname1;
      author=author1;
          
}
        
  void calculate()
{
   total=total+quantity*price;
  
}

   void display()
{

   System.out.println("bno ="+bno);
System.out.println("bno ="+bname);
System.out.println("bname ="+author);
System.out.println("price ="+price);
System.out.println("quantity ="+quantity);
System.out.println("total ="+total);
}

  public static void main(String arg[])

 {
     book ob=new book();
     
     ob.accepte(101,500,3,"the broken heart","rehan");
     ob.calculate();
     ob.display();
}
}