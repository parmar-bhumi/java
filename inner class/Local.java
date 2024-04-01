class Student
{
	void display()
	{
		class Mca
		{
			void Msg()
			{
				System.out.println("Good morning...");
			}
		}
		Mca m=new Mca();
		m.Msg();
	}
}
class Local
{
	public static void main(String[] args) 
	{
			Student s=new Student();
			s.display();
	}
}