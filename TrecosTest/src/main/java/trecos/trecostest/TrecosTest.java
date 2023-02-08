package trecos.trecostest;

import trecos.exercicios.Calculator;
import trecos.exercicios.DateToFormat;
import trecos.exercicios.MultiTable;
import trecos.exercicios.Validator;

public class TrecosTest {

    public static void main(String[] args) {

        Calculator.sum(-2, -2);
        Calculator.sum(-2, 2);
        Calculator.sub(10, -10);
        Calculator.sub(-5, -5);
        Calculator.mul(0, 0);
        Calculator.mul(-1, -1);
        Calculator.mod(1, 1);
        Calculator.div(0, 0);
        System.out.println("-".repeat(100));

        MultiTable.tableAll();
        System.out.println("-".repeat(100));

        DateToFormat.getDateBr();
        DateToFormat.getDateSystem();
        DateToFormat.getDateTimeBr();
        DateToFormat.getDateTimeSystem();
        System.out.println("-".repeat(100));

        Validator.isPhone("55 21 9857-54321");
        Validator.isTel("55 21 4433-2211");
        Validator.isURL("http://teste");
        Validator.isURL("https://teste");
        Validator.isCPF("000.000.000-00");
        System.out.println("-".repeat(100));
        
    }
}