import java.util.Comparator;

public class ListaEnlazada<T> {

  Nodo<T> primerNodo;
  Comparator<T> orden;

  public ListaEnlazada(Comparator<T> comp) {
    this.orden = comp;
  }

  public void agregarOrdenado(T datoNuevo) {
    Nodo<T> nuevo = new Nodo<T>(datoNuevo);
    Nodo<T> puntero=primerNodo;
    Nodo<T> puntero2;
    boolean flag = false;
    //si el primer nodo esta vacio 
    while(flag!=false){
      if (primerNodo == null) {
        primerNodo = nuevo;
        primerNodo.setSiguiente(null);
        flag = true;
      }
      //si el puntero es mayor al ingresado
      else if((orden.compare(puntero.getValor(), nuevo.getValor()) > 0)){
        System.out.println("puntero es: " +puntero.getValor());
        System.out.println("nuevo es: " +nuevo.getValor());
        puntero.setSiguiente(nuevo);
        puntero=puntero.getSiguiente();
        flag = true;
      }
      System.out.println("no entro en ninguno");
      flag=true;
      //si el nodo ingresado va al final
      // else if((orden.compare(puntero.getValor(), nuevo.getValor()) > 0)&&(puntero2==null)){
      //   System.out.println("va al final");
      //   aux = puntero;
      //   puntero = nuevo;
      //   nuevo.setSiguiente(aux);
  
      // }
    }
  }

  public String toString() {
    Nodo<T> puntero = primerNodo;
    String aux = "";
    while(puntero!=null){
        aux += puntero.getValor()+",";
        puntero = puntero.getSiguiente();
    }
    return aux;
  }
}
