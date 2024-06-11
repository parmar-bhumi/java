interface First
{
	void msg();
}
class Second implements First
{
	public void msg()
	{
		System.out.println("Hello students...");
	}
}
class I_F1
{
	public static void main(String[] args) 
	{
			Second s=new Second();
			s.msg();
	}
}