import java.util.*;
class oddeven
{
public static void main(String []s)
{
int num;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
if(num % 2 == 0)
System.out.println("entered number is even");
else
System.out.println("entered number is odd");
}
}
