import java.util.*;
class Error
{
	Scanner sc=new Scanner(System.in);
	Error()
	{
		System.out.println("Enter number:");
		int no=sc.nextInt();
		System.out.println("Enter Divi number:");
		int d_no=sc.nextInt();
		int div=0;
		try
		{
			div=no/d_no;
			System.out.println("Division:"+div);
		}
		Catch(Exception e)
		{
			System.out.println("Do not insert zero:"+e);
		}
	}
}
class T_c
{
	public static void main(String[] args) 
	{
		Error e=new Error();	
	}
}