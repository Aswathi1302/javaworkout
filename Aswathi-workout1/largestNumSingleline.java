import java.util.Scanner;
class largestNumSingleline{
public static void main(String args[]){
int a,b,c,l;
Scanner s=new Scanner(System.in);
System.out.println("enter the first number");
a=s.nextInt();
System.out.println("enter the second number");
b=s.nextInt();
System.out.println("enter the third number");
c=s.nextInt();
l=c>(a>b?a:b)?c:(a>b?a:b);
System.out.println("the largest number is:"+l);
}
}