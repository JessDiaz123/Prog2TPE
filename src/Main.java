import java.util.Comparator;

import Comparadores.ComparadorInt;
import Comparadores.ComparadorString;

public class Main {
    public static void main(String[] args) {
        
        ComparadorString c2 = new ComparadorString();
        
        
        
        //String
        ListaEnlazada<String> listaString = new ListaEnlazada<>(c2);

        listaString.agregarOrdenado("Parcial");
        listaString.agregarOrdenado("Facil");
        listaString.agregarOrdenado("Es");
        listaString.agregarOrdenado("Prog2");

        System.out.println(listaString);

        //int 
        // ComparadorInt c1 = new ComparadorInt();
        // ListaEnlazada<Integer> l1 = new ListaEnlazada<>(c1);
        // l1.agregarOrdenado(16);
        // l1.agregarOrdenado(2);
        // l1.agregarOrdenado(17);
        // l1.agregarOrdenado(7);
        // l1.agregarOrdenado(4);

        // System.out.println(l1);

    }
}
