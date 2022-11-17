import java.util.Comparator;

import Comparadores.ComparadorInt;

public class Main {
    public static void main(String[] args) {
        
        ComparadorInt c1 = new ComparadorInt();
        
        ListaEnlazada<Integer> l1 = new ListaEnlazada<>(c1);

        l1.agregarOrdenado(16);
        l1.agregarOrdenado(2);
        l1.agregarOrdenado(17);
        l1.agregarOrdenado(7);
        l1.agregarOrdenado(4);

        System.out.println(l1);

    }
}
