package objetos;

public class Nodo {
    private Nodo next;
    private Termino term;

    public Nodo(Termino a) {
        next = null;
        this.term = a;
    }
    public Nodo(Termino a,Nodo n){
        this.term = a;
        next= n;
    }

    public Termino getTermino(){
        return term;
    }

     public void enlazarSiguiente(Nodo n){
        next = n;
     }

     public Nodo getNext(){
        return next;
     }
}
