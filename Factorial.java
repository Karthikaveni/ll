# ll
import java.util.*;
import java.io.*;
public class Factorial
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int i,n,result=1;
n=sc.nextInt();
for(i=1;i<=n;i++)
{
result = result * i;
} 
System.out.println("The factorial of num is:"+result);
}
}
