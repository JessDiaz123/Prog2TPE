import java.util.Comparator;

public class ListaEnlazada <T> {
    
    Nodo <T> primerNodo;
    Comparator <T> orden;

    public void agregarOrdenado( Nodo <T> nuevo){
        if(this.primerNodo==null){
            this.primerNodo = nuevo;
        }
        else{

        }
    }

    @Override
    public String toString() {
        return primerNodo.toString();
    }



}
