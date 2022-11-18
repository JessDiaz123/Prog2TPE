package A;
import java.util.Iterator;

public class MiIterador<T> implements Iterator<T>{
    private Nodo <T> cursor ;

    public MiIterador(Nodo<T> nodo){
        this.cursor = nodo;
    }
    
    @Override
    public boolean hasNext() {
        return this.cursor!=null;
    }

    @Override
    public T next() {
        T valor = cursor.getValor();
        cursor = cursor.getSiguiente();
        return valor;
    }


}
