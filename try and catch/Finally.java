class Student
{
	Student()
	{
		try 
		{
			int num[]={1,2,3};
			int c=num[2]/1;
			System.out.println("Division"+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("DO not allowed zero...");
		}
		finally
		{
			System.out.println("Done...");
		}
	}
}
class Finally
{
	public static void main(String[] args) {
		Student s=new Student();
	}
}