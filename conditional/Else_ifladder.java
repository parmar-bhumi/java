class Else_ifladder
{
	public static void main(String[] args) 
	{
		int marks=90;
		if(marks>=90)
		{
			System.out.println("Distinction");
		}else if(marks>=80 && marks<89)
		{
			System.out.println("First class");
		}
		else if(marks >=79 && marks<70)
		{
			System.out.println("Second class");
		}
		else if(marks >=69 && marks<50)
		{
			System.out.println("Pass class");
		}
		else if(marks <50)
		{
			System.out.println("fail");
		}
		else{
			System.out.println("invalid");
		}	
	}
}/*
public class Else_ifladder {  
public static void main(String[] args) {  
    int marks=65;  
      
    if(marks<50){  
        System.out.println("fail");  
    }  
    else if(marks>=50 && marks<60){  
        System.out.println("D grade");  
    }  
    else if(marks>=60 && marks<70){  
        System.out.println("C grade");  
    }  
    else if(marks>=70 && marks<80){  
        System.out.println("B grade");  
    }  
    else if(marks>=80 && marks<90){  
        System.out.println("A grade");  
    }else if(marks>=90 && marks<100){  
        System.out.println("A+ grade");  
    }else{  
        System.out.println("Invalid!");  
    }  
}  
}  */