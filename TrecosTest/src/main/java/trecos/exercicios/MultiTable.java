package trecos.exercicios;

public class MultiTable {

    public static void table(int n1) {
        for(int i = 0; i <= 10; i++) {

        }
    }

    public static void tableAll() {
        for(int i = 0; i <= 10; i++) {
            for(int ii = 0; ii <= 10; ii++) {
                System.out.println(i + " x " + ii + " = " + (i * ii));
            }
            
            System.out.println("-".repeat(100));
        }
    }
}
