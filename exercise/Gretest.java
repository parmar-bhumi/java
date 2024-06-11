import java.util.*;
class Gretest
{
	public static void main(String[] args) 
	{
		int a,b,c,turnary,large;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		a=sc.nextInt();	
		System.out.print("Enter second number:");
		b=sc.nextInt();	
		System.out.print("Enter third number:");
		c=sc.nextInt();	
		turnary=a>b?a:b;
		large=c>turnary?c:turnary;
		System.out.println("The gretest no is:"+large);
	}
}