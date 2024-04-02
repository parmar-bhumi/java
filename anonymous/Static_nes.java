class Student
{
	static class Mca
	{
		void sem()
		{
			System.out.println("semester two...");
		}
	}
} 
class Static_nes
{
	public static void main(String[] args) 
	{
		Student.Mca sm=new Student.Mca();
		sm.sem();	
	}
}