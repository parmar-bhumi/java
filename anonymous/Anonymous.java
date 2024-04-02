abstract class Vehicle 
{
    abstract int wheel(); 
}

public class Anonymous 
{
    public static void main(String[] args) 
    {
        Vehicle v = new Vehicle() 
        { 
            int wheel() 
            { 
                return 4;
            }
        };

        System.out.println(v.wheel()); 

        Vehicle v1 = new Vehicle() 
        { 
            int wheel() 
            { 
                return 2;
            }
        };

        System.out.println(v1.wheel()); 
    }
}
