import java.util.*;
class numRev
{
    public static void main(String args[])
    {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        num=s.nextInt();
        int rem=0,rev=0;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("the reverse is\t"+rev);
    }
}

