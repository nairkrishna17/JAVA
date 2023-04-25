import java.util.Scanner;

interface A {
    void displayA();
}

interface B {
    void displayB();
}

class C implements A, B {
    public void displayA() {
        System.out.println("This is interface A.");
    }

    public void displayB() {
        System.out.println("This is interface B.");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        C obj = new C();
        obj.displayA();
        obj.displayB();

        System.out.println("The square of " + n + " is " + n*n + ".");
    }
}
