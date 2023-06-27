package exerciseone.matematicamaluca;

public class MatematicaMaluca {

    private int num = 0;
    
    public MatematicaMaluca(int num) {
        if (num > 30) {
            this.num = num * 4;
            
        } else if (num < 30 && num > 10) {
            this.num = num * 3;
            
        } else {
            this.num = num * 2;
        }
    }
    
    public int getNum() {
        return this.num;
    }
}
