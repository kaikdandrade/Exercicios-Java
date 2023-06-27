package dice.main;

import dice.Dice;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        Dice dice = new Dice();
        int count = 0;
        boolean hit = false;
        String input;

        System.out.println("Jogo do dado");
        System.out.println("Teste sua sorte e descubra em quantas jogadas você consegue tirar o número 6.");
        System.out.println("O jogo termina quando você Tirar o número seis ou atingir 10 tentativas.");

        while (count < 10 && hit == false) {
            
            System.out.println("Tentativa de número: " + count);
            System.out.print("Escreva 'play' para tentar: ");
            
            input = userInputScanner.nextLine();
            if ("play".equalsIgnoreCase(input)) {
                count++;
                dice.playDice();
                System.out.println("---------------");
                System.out.println(  "Você tirou: " + dice.getNumber());
                System.out.println("---------------");
                if (dice.getNumber() == 6) {
                    hit = true;
                }
            }
        }
        
        if (hit == true) {
            System.out.println("Parabens!!!! Você acertou em " + count + " jogadas");
        } else {
            System.out.println("Que pena!!!!! Tente novamente");
        }
    }
}