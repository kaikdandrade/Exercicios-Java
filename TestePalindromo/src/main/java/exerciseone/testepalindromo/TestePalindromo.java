package exerciseone.testepalindromo;

public class TestePalindromo {

    public static boolean verificaPalindromo(String palavra) {
        palavra = palavra.trim();
        int tamanho = palavra.length();
        
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}