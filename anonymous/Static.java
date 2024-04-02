class First
{
	static class Second
	{
		Second()
		{
			System.out.println("Good morning students...");
		}
	}
}
class Static
{
	public static void main(String[] args) {
		First.Second fs=new First.Second();
	}
}