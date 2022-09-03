import java.util.*;
class swapWithTemp
{
    public static void main(String args[])
    {
        int num1,num2,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number");
        num1=s.nextInt();
        System.out.println("enter the second number");
        num2=s.nextInt();
        System.out.println("before swap  first num="+num1+"\n second num="+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swap  first num="+num1+"\n second num="+num2);
    }
}

