class First
{
	interface Second
	{
		void msg();
	}
}
class Third implements First.Second
{
	public void msg()
	{
		System.out.println("jay hind students");
	}
}
class Nested
{
	public static void main(String[] args) 
	{
		First.Second fs=new Third();	
		fs.msg();
	}
}