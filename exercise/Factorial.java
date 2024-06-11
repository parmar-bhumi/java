// 3.Write a program user through input one number and perform Factorial.
// Using Constructor.
import java.util.*;
class First
{
	Scanner sc=new Scanner(System.in);
	int no,fact=1;
	First()
	{
		System.out.print("Enter no:");
		no=sc.nextInt();
	}
	void perform()
	{
		int i;
		for(i=1;i<=no;i++)
		{
			fact *= i;
		}
		System.out.println("fact is:"+fact);
	}
}
 public class Factorial
{
	public static void main(String[] args) 
	{
		First F=new First();
		F.perform();	
	}
}







