abstract class First
{
	abstract void msg();
	abstract final void run();
}
class Second 
{
	void msg()
	{
		System.out.println("Hello students");
	}
	void run()
	{
		System.out.println("Good morning");
	}
}
class F_m
{
	public static void main(String[] args) {
		Second S=new Second();
		s.msg();
		s.run();
	}
}