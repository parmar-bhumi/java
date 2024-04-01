import java.util.*;
class First
{
	Scanner sc = new Scanner(System.in);
	class Second
	{
		Second()
		{
			int no;
			System.out.print("Enter no:");
			no=sc.nextInt();
			System.out.println("Number is:"+no);
		}
	}
	Second s=new Second();
}
class Nested
{
	public static void main(String[] args) 
	{
			First f=new First();
	}
}