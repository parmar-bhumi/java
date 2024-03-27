import java.util.*;
class First
{
	Scanner sc=new Scanner(System.in);
	void per(int no)
	{
		if(no%2==0)
		{
			System.out.println("The number is Even:"+no);
		}
		else
		{
			System.out.println("The number is odd:"+no);
		}
	}
}
class Second extends First
{
	@Override
	void per(int i)
	{
		System.out.print("Enter number:");
		int num=sc.nextInt();
		super.per(num);
		System.out.println("Cube is:"+(num*num*num));
	}
}
class Poly3
{
	public static void main(String[] args) 
	{
		First F=new Second();
		F.per(0);	
	}
}

