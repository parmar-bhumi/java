class Apple
{
   public void methodA()
   {
      System.out.println("Hello students");
   }
}
class Bat extends Apple
{
   public void methodB()
   {
      System.out.println("Good morning");
   }
}
class Cat extends Apple
{
  public void methodC()
  {
     System.out.println("Hello World");
  }
}
class Herircal
{
  public static void main(String args[])
  {
     Bat b = new Bat();
     Cat c = new Cat();
     b.methodA();
     c.methodA();
  }
}
