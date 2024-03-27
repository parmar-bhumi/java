class First
{
	void msg()
	{
		System.out.println("Jay hind students...");
	}	
}
class  second extends First 
{
	@Override
	void msg()
	{
		System.out.println("Jay hind sir..");
		super.msg();
	}
}
class Poly1{
	public static void main(String[] args) 
	{
		First F=new second();
		F.msg();
	}
}