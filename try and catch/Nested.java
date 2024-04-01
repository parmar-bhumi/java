class Student
{
	Student()
	{
		int [] num={10,20,30};
		System.out.println(num[2]);
		try 
		{
			String str="atmiya";
			System.out.println(str.length());
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println(ae);
	}
}


class Nested
{
	public static void main(String[] args) 
	{
		Student s=new Student();	
	}
}