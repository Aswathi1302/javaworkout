import java.util.*;
class armstrongNum
{
    public static void main(String args[]){
    int x=0,y=0;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the first number");
    x=s.nextInt();
    System.out.println("enter the limit number");
    y=s.nextInt();
    for(int i=x;i<=y;i++)
    {
        int c,rev,sum=0;
        c=i;
        while( c!=0)
        {
            rev=c%10;
            sum=sum+(rev*rev*rev);
            c=c/10;
        }
        if(sum==i)
        {
            System.out.println(""+i+"is armstrong number");
        }
    }
   }
}