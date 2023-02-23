package dice;

import java.util.Random;

public class Dice {
    
    private int number;

    public Dice() {
        this.setNumber(1);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 0 && number < 7) {
            this.number = number;
        } else {
            this.number = 1;
        }
    }

    public void playDice() {
        Random gen = new Random();
        this.setNumber(gen.nextInt(6) + 1);
    }
}