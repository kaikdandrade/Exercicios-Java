package exerciseone.prova;

public class Prova {

    public static int vetor(int n, int vet[]) {
        int val;
        val = vet[0];
        for(int i = 1; i < n; i++) {
            if(val > vet[i]) {
                val = vet[i];
            }
        }
        
        return val;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
