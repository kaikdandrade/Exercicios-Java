package trecos.exercicios;

public class Calculator {
    
    public static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public static void sub(int n1, int n2) {
        System.out.println(n1 - n2);
    }
    
    public static void div(int n1, int n2) {
        try {
            System.out.println(n1 / n2);
        } catch (Exception e) {
            System.out.println("Erro *divide by 0*");
        }
    }
    
    public static void mul(int n1, int n2) {
        System.out.println(n1 * n2);
    }
    
    public static void mod(int n1, int n2) {
        System.out.println(n1 % n2);
    }
}
