package Comparadores;

import java.util.Comparator;

public class ComparadorInvertido<T> implements Comparator<T>{
    private Comparator <T> directo;

    public ComparadorInvertido(Comparator <T>directo){
        this.directo=directo;
    }

    @Override
    public int compare(T o1, T o2) {
        return -directo.compare(o1,o2);
    }    

}
