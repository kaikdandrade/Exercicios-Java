package trecos.calculator;

import javax.swing.JOptionPane;

public class MultiTable {
    Calculator calc = new Calculator();
    
    public MultiTable(int n1) {
        if(n1 <= 0 || n1 > 9) {
            JOptionPane.showConfirmDialog(null, "Erro! Número escolhi inválido!", "Oooops!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            for(int i = 2; i <= 10; i++) {
                System.out.println(n1 + " x " + i + " = " + calc.mul(i, n1));
            }
        }
    }
}