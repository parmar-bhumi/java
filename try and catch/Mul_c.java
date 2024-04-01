class First
{
	First()
	{
		try 
		{
			int[]num={1,2,3};
			System.out.println(num[3]);
			int c=num[2]/1;
			System.out.println("Division is:"+c);
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println(ab);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
}
class Mul_c
{
	public static void main(String[] args) 
	{
		First f=new First();
	}
}