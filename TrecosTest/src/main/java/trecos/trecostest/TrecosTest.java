package trecos.trecostest;

import trecos.exercicios.Calculator;
import trecos.exercicios.DateToFormat;
import trecos.exercicios.MultiTable;
import trecos.exercicios.Validator;

public class TrecosTest {

    public void exerc1_2() {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 2));
        System.out.println(calc.sub(9, 3));	
        System.out.println(calc.mul(3, 3));
        System.out.println(calc.div(4, 2));
        System.out.println(calc.mod(4, 3));  
    }
    
    public void exerc3() {
        MultiTable multiTable = new MultiTable(15);
    }
    
    public void exerc4(String email) {
        Validator.isEmail(email);
    }
    
    public void exerc5_6() {
        DateToFormat dateToFormat = new DateToFormat();
        System.out.println(dateToFormat.getDateBr());
        System.out.println(dateToFormat.getDateUs());
    }
}
