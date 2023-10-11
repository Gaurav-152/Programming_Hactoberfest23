import java.util.Scanner;

class Addno
{
public static void main(String args[])
{
int a;
int b;
int s;
Scanner add=new Scanner(System.in);
System.out.println("Enter first number: ");
a=add.nextInt();
System.out.println("Enter second number: ");
b=add.nextInt();


s=a+b;
System.out.println("Sum is " + s);
}
}