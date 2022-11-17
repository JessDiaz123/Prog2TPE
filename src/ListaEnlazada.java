import java.util.Comparator;

public class ListaEnlazada<T> {

  Nodo<T> primerNodo;
  Comparator<T> orden;

  public ListaEnlazada(Comparator<T> comp) {
    this.orden = comp;
  }

  public void agregarOrdenado(T datoNuevo) {
    Nodo<T> nuevo = new Nodo<T>(datoNuevo);
    Nodo<T> puntero1;
    Nodo<T> puntero2;
    Nodo<T> aux;
    boolean flag = false;
    // si el primer nodo esta vacio
    // while(flag!=false){
    if (primerNodo == null) {
      primerNodo = nuevo;
      primerNodo.setSiguiente(null);
      flag = true;
    } else {
      puntero1 = primerNodo;
      while (puntero1 != null) {
        puntero2 = puntero1.getSiguiente();
        // el numero nuevo debe ir al inicio de la lista?
        // si el numero ingresado es mas grande que la raiz, pasa a ser la raiz
        if (orden.compare(puntero1.getValor(), nuevo.getValor()) >= 0) {
          nuevo.setSiguiente(primerNodo);
          primerNodo = nuevo;
          break;
        } else {
          // el numero nuevo va al final de la lista?
          //por medio del while va a ir crecio este puntero1, hasta llegar al final
          if (orden.compare(nuevo.getValor(), puntero1.getValor()) > 0 && puntero2 == null) {
            puntero1.setSiguiente(nuevo);
            break;
          }
          else if ((orden.compare( nuevo.getValor(), puntero1.getValor())>0)&&
          orden.compare( puntero2.getValor(),nuevo.getValor())>0){
            // el nuevo tiene que ir entre 2 nodos?
              puntero1.setSiguiente(nuevo);
              nuevo.setSiguiente(puntero2);
              break;
          }
          else{
            puntero1 = puntero1.getSiguiente();
          }
        }
      }
    }
  }
  /*
   * else if((orden.compare(primerNodo.getValor(), nuevo.getValor()) > 0)){
   * aux = primerNodo;
   * primerNodo=nuevo;
   * primerNodo.setSiguiente(aux);
   * flag = true;
   * }
   * else if(orden.compare(nuevo.getValor(),primerNodo.getValor()) > 0){
   * puntero = primerNodo;
   * while(orden.compare(nuevo.getValor(),puntero.getValor()) > 0 &&
   * puntero.getSiguiente()!=null){
   * puntero=puntero.getSiguiente();
   * System.out.println("puntero vale:"+ puntero.getValor());
   * }
   * if(puntero.getSiguiente()==null){
   * puntero.
   * }
   * aux = puntero.getSiguiente();
   * primerNodo.setSiguiente(nuevo);
   * nuevo.setSiguiente(aux);
   * }
   * 
   */

  public String toString() {
    Nodo<T> puntero = primerNodo;
    String aux = "";
    while (puntero != null) {
      aux += puntero.getValor() + ",";
      puntero = puntero.getSiguiente();
    }
    return aux;
  }
}
