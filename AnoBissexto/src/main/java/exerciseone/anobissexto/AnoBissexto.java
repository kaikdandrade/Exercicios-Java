package exerciseone.anobissexto;

public class AnoBissexto {
    private int ano;

    public AnoBissexto(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }
}