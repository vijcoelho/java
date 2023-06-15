package JAVA_EXC;

public class exc15 {
    public static void main(String[]args) {
        int a = 10;
        int b = 5;
        System.out.println("Antes = " + a);
        System.out.println("Antes = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Depois = " + a);
        System.out.println("Depois = " + b);
    }
}
