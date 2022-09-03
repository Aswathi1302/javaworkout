import java.util.*;
class largeAmongThree{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a,b,c;
      System.out.println("enter the first number:");
      a=s.nextInt();
      System.out.println("enter the second number:");
      b=s.nextInt();
      System.out.println("enter the third number:");
      c=s.nextInt();
      if(a>b && a>c)
      System.out.println(a + " is largest");
      else if(b>c && b>a)
      System.out.println(b + " is largest");
      else
      System.out.println(c + "is largest");
    }
}