package A;
import java.util.Comparator;

import A.Comparadores.ComparadorInt;
import A.Comparadores.ComparadorInvertido;
import A.Comparadores.ComparadorString;

public class Main {

  public static void main(String[] args) {
    ComparadorString c2 = new ComparadorString();

    //String
    ListaEnlazada<String> ls = new ListaEnlazada<>(c2);

    ls.add("Parcial");
    ls.add("Facil");
    ls.add("Es");
    ls.add("Prog2");

    //find
    // System.out.println(ls);
    // System.out.println("resultado:" + ls.find("aaa"));
    
    //contains
    // System.out.println("Utilizando el contains");
    // System.out.println(ls.contains("Parcial"));
    // eliminar
    // System.out.println(ls);
    // ls.remove(2);
    // System.out.println(ls);

    // int
    ComparadorInt cInt = new ComparadorInt();
    ListaEnlazada<Integer> l1 = new ListaEnlazada<>(cInt);
    l1.add(16);
    l1.add(1);
    l1.add(2);
    l1.add(2);
    l1.add(7);
    l1.add(7);
    l1.add(4);
    
    //contains
    // System.out.println("Probando contains numero");
    // System.out.println(l1.contains(3));

    
    // // mostrar lista con iterador
    // l1.showList();
    // System.out.println("=====Agrego un numero====");
    // l1.add(-23);
    // l1.showList();

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


    // encontrar la primer ocurrencia
    // System.out.println(l1);
    // System.out.println("la posicion es:"+l1.find(7));;
    
    // cambiar el metodo de ordenar y ordenar de otra manera
    // System.out.println(l1);
    // ComparadorInvertido <Integer> cNuevo = new ComparadorInvertido<>(cInt);
    // l1.setOrden(cNuevo);
    // System.out.println("con el cambio de comparador");
    // System.out.println(l1);

  }
}
