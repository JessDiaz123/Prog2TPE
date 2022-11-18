package A;

public class Nodo <T>{

    private T valor;
    private Nodo<T> siguiente;

    public Nodo ( T valor ){
        this.valor = valor;
        this.siguiente = null;
    }


    @Override
    public String toString() {
        return this.valor.toString();
    }
    public Nodo<T> getSiguiente(){
        return this.siguiente;
    }
    public void setSiguiente(Nodo<T> sig){
        this.siguiente = sig;
    }
    public T getValor(){
        return this.valor;
    }

    
}

