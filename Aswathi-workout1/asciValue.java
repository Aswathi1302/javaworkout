import java.util.*;
class asciValue
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the character");
        char chr=s.next().charAt(0);
        int asciiValue=chr;
        System.out.println("Ascii value of  "+chr+" is"+asciiValue);
    }    
}
