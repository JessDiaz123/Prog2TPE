import java.util.Comparator;

public class ListaEnlazada<T> {

  private Nodo<T> primerNodo;
  private Comparator<T> orden;
  private int size = -1;

  public ListaEnlazada(Comparator<T> comp) {
    this.orden = comp;
  }

  public void removeAll(T elementoAEliminar) {
    Nodo<T> puntero = primerNodo;
    int pos = 0;

    while (puntero != null) {
      // System.out.println(pos);
      // System.out.println(puntero);
      if (puntero.getValor().equals(elementoAEliminar)) {
        System.out.println("entro aca");
        this.remove(pos);
        puntero = puntero.getSiguiente();
      } else {
        puntero = puntero.getSiguiente();
        pos++;
      }
    }
  }

  public void remove(int posicionAEliminar) {
    int posicion = 0;
    Nodo<T> puntero = primerNodo;
    Nodo<T> punteroAnterior = null;
    if (posicionAEliminar < 0 || posicionAEliminar > this.getSize()) {
      System.out.println("no existe esa posicion en el arreglo");
      return;
    } else {
      while (posicion < posicionAEliminar) {
        punteroAnterior = puntero;
        puntero = puntero.getSiguiente();
        posicion++;
      }
      //esto si estoy no estoy en el primerNodo
      if(punteroAnterior!=null){
        punteroAnterior.setSiguiente(puntero.getSiguiente());
      }
      //estp si estoy en el primer nodo
      else{
        this.primerNodo=primerNodo.getSiguiente();
      }
      this.size--;
    }
  }

  public int getSize() {
    return this.size;
  }

  public void add(T datoNuevo) {
    Nodo<T> nuevo = new Nodo<T>(datoNuevo);
    Nodo<T> puntero1;
    Nodo<T> puntero2;
    // si el primer nodo esta vacio
    if (primerNodo == null) {
      primerNodo = nuevo;
      primerNodo.setSiguiente(null);
    } 
    else {
      puntero1 = primerNodo;
      while (puntero1 != null) {
        puntero2 = puntero1.getSiguiente();

        // el numero nuevo debe ir al inicio de la lista?
        // si el numero ingresado es mas grande que la raiz, pasa a ser la raiz
        if (orden.compare(puntero1.getValor(), nuevo.getValor()) >= 0) {
          nuevo.setSiguiente(primerNodo);
          primerNodo = nuevo;
          break;
        }
        // el numero nuevo va al final de la lista?
        //por medio del while va a ir crecio este puntero1, hasta llegar al final
        else if (
          orden.compare(nuevo.getValor(), puntero1.getValor()) > 0 &&
          puntero2 == null
        ) {
          puntero1.setSiguiente(nuevo);
          break;
        }
        // el nuevo tiene que ir entre 2 nodos?
        else if (
          (orden.compare(nuevo.getValor(), puntero1.getValor()) > 0) &&
          orden.compare(puntero2.getValor(), nuevo.getValor()) >= 0
        ) {
          puntero1.setSiguiente(nuevo);
          nuevo.setSiguiente(puntero2);
          break;
        }
        // si no, sigo recorriendo la lista hasta que puntero1 sea null
        else {
          puntero1 = puntero1.getSiguiente();
        }
      }
    }
    size++;
  }

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
/*
 public void agregarOrdenado(T datoNuevo) {
    Nodo<T> nuevo = new Nodo<T>(datoNuevo);
    Nodo<T> puntero1;
    Nodo<T> puntero2;
    // si el primer nodo esta vacio
    // while(flag!=false){if (primerNodo == null) {
      primerNodo = nuevo;
      primerNodo.setSiguiente(null);
    } else {
      puntero1 = primerNodo;
      while (puntero1 != null) {
        puntero2 = puntero1.getSiguiente();
        // el numero nuevo debe ir al inicio de la lista?
        if (orden.compare(puntero1.getValor(), nuevo.getValor()) >= 0) {
          nuevo.setSiguiente(primerNodo);
          primerNodo = nuevo;
          break;
        } else {
          // el numero nuevo va al final de la lista?
          if (orden.compare(nuevo.getValor(), puntero1.getValor()) > 0 && puntero2 == null) {
            puntero1.setSiguiente(nuevo);
            break;
          }
          else if ((orden.compare( nuevo.getValor(), puntero1.getValor())>0)&&
          orden.compare( puntero2.getValor(),nuevo.getValor())>=0){
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
 */
