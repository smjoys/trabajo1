package objetos;

public class Termino {
    private int coef;
    private int expo;

    public Termino() {
        this.coef = 0;
        this.expo = 0;
    }

    public Termino(int coef, int expo){
        this.coef=coef;
        this.expo=expo;
    }

    public void setExpo(int ex){
        this.expo=ex;
    }

    public int getCoef() {
        return this.coef;
    }

    public int getExpo() {
        return this.expo;
    }
}
