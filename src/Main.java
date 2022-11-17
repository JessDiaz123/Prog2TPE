import Comparadores.ComparadorInt;
import Comparadores.ComparadorInvertido;
import Comparadores.ComparadorString;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    ComparadorString c2 = new ComparadorString();

    //String
    // ListaEnlazada<String> ls = new ListaEnlazada<>(c2);

    // ls.add("Parcial");
    // ls.add("Facil");
    // ls.add("Es");
    // ls.add("Prog2");

    // eliminar
    // System.out.println(ls);
    // ls.remove(2);
    // System.out.println(ls);

    // int
    ComparadorInt cInt = new ComparadorInt();
    ListaEnlazada<Integer> l1 = new ListaEnlazada<>(cInt);
    l1.add(16);
    System.out.println("el size es: " + l1.getSize());
    l1.add(1);
    System.out.println("el size es: " + l1.getSize());
    l1.add(2);
    l1.add(2);
    l1.add(7);
    l1.add(7);
    l1.add(4);


    System.out.println("el size es: " + l1.getSize());
    //eliminar todas las ocurrencias
    // System.out.println(l1);
    // l1.removeAll(2);
    // l1.removeAll(16);
    // l1.removeAll(1);
    // l1.removeAll(4);
    // l1.removeAll(7);
    // System.out.println(l1);

    //eliminar
    // System.out.println(l1);
    // l1.remove(0);
    // System.out.println(l1);


    //encontrar la primer ocurrencia
    // System.out.println(l1);
    // System.out.println("la posicion es:"+l1.find(-23));;
    
    // cambiar el metodo de ordenar y ordenar de otra manera
    // System.out.println(l1);
    // ComparadorInvertido <Integer> cNuevo = new ComparadorInvertido<>(cInt);
    // l1.setOrden(cNuevo);
    // System.out.println("con el cambio de comparador");
    // System.out.println(l1);

  }
}
