class First
{
	String val="Bhumi";
	First()
	{
		try
		{
			int num=Integer.parseInt(val);
			System.out.println("This value is:"+num);
		}
		Catch(Exception e)
		{
			System.out.println("string not allowed"+e);
		}
	}
}
class T_c1
{
	public static void main(String[] args) 
	{
		First f=new First();
	}
}