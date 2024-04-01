import java.util.*;
class Student
{
	Scanner sc = new Scanner(System.in);
	void sem2()
	{
		class Mca
		{
			Mca()
			{
				System.out.print("Enter number:");
				int no=sc.nextInt();
				System.out.println("Number is:"+no);
			}
		}
		Mca m=new Mca();
	}
}
class Local_c
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.sem2();
	}
}