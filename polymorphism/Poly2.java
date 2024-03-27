import java.util.*;

class First {
    void process(int num) {
        System.out.println("cube is:" + (num * num * num));
    }
}

class Second extends First {
    @Override
    void process(int num) {
        System.out.println("square:" + (num * num));
        super.process(num);
    }

    // Add a parameterless constructor
    Second() {
    }
}

public class Poly2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        First F = new Second();
        System.out.print("Enter number:");
        int no = sc.nextInt();
        F.process(no);
    }
}
