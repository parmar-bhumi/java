import java.util.*;
class Get
	{
		Scanner sc=new Scanner(System.in);
		int no;
		Get()
		{
			System.out.print("Enter no:");
			no=sc.nextInt();
		}
	}
class Squre extends Get
{
	Squre()
	{
		System.out.println("Squre is:"+(no*no));
	}
}
class Cube extends Get
{
	Cube()
	{
		System.out.println("Cube is:"+(no*no*no));
	}
}	
class Squrecube
{
	public static void main(String[] args) 
	{
		Squre s=new Squre();
		Cube c=new Cube();
	}
}