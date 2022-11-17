import Comparadores.ComparadorInt;
import Comparadores.ComparadorString;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    ComparadorString c2 = new ComparadorString();

    // //String
    // ListaEnlazada<String> listaString = new ListaEnlazada<>(c2);

    // listaString.add("Parcial");
    // listaString.add("Facil");
    // listaString.add("Es");
    // listaString.add("Prog2");

    // System.out.println(listaString);

    // int
    ComparadorInt c1 = new ComparadorInt();
    ListaEnlazada<Integer> l1 = new ListaEnlazada<>(c1);
    l1.add(16);
    l1.add(2);
    l1.add(17);
    l1.add(7);
    l1.add(4);

    System.out.println(l1);
    l1.remove(4);
    System.out.println(l1);
  }
}
