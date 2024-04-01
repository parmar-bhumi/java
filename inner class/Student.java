class Nested 
{
	class Mca
	{
		void dis()
		{
			System.out.println("Hello students...");
		}
	}
	Mca m=new Mca();
}
class Student
{
	public static void main(String[] args) {
		Nested n=new Nested();
		n.m.dis();
	}
}