import java.util.*;
class User
{
	Scanner sc=new Scanner(System.in);
	int no;
	User()
	{
		System.out.print("Enter number:");
		no=sc.nextInt();
	}
}
class Table extends User
{
	Table()
	{
		System.out.println("Table number is:"+no);
		for(int i=1;i<=10;i++)
		{
			System.out.println(+no+ "*" +i+ "=" +(no*i));
		}
	}
}
class Squre extends User
{
	Squre()
	{
		System.out.println("Squre Number is:"+no);
		for(int i=1;i<=no;i++)
		{
			System.out.println(+i+"*"+i+"="+(i*i));
		}
	}
}
class Exercise
{
	public static void main(String[] args) 
	{
		Table t=new Table();
		Squre s=new Squre();
	}
}