package objetos;

public class PolinomioList {
    private Nodo cabeza;

    public PolinomioList() {
        cabeza = null;
    }

    public void insertarTermino(Termino t){
        if (cabeza==null) cabeza = new Nodo(t);
        else cabeza=new Nodo(t,cabeza);
    }

}
