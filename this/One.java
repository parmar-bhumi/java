class K1
{
	void msg()
	{
		System.out.println(this);
	}
}
class One{
	public static void main(String[] args) 
	{
		K1 k=new K1();
		System.out.println(k);
		k.msg();	
	}
}