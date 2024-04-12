 final class First//find kadhi nakhvanu
{
	int a=10;
	First()
	{
		System.out.println(a);
	}
}
class Second extends First//extends nhi lhvanu
{
	//int a=15;
	Second()
	{
		System.out.println("squre is:"+(a*a));
	}
}
class F_c
{
	public static void main(String[] args) 
	{
		First F=new First();
		Second s=new Second();
	}
}