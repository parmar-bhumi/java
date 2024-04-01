class Th_k
{
	Th_k()
	{
		int[]num={10,20,30};
		System.out.println(num[2]/1);
        throw new ArithmeticException();
	}
}
class Student
{
	public static void main(String[] args) {
		Th_k th=new Th_k();		
	}
}

