class First
{
	void add()
	{
		int a=20,b=10;
		System.out.println("Addition is:"+(a+b));
	}
	void add(int i,int j)
	{
		System.out.println("Addition is:"+(i+j));
	}
	void add(int a,double b)
	{
		System.out.println("Addition is"+(a+b));
	}
}

class Poly4
{
	public static void main(String[] args) {
		First F=new First();
		F.add(30,50);
		F.add(50,25.50);
		F.add();
	}
}