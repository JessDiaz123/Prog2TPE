package C;

import java.util.ArrayList;
import java.util.Comparator;

import A.ListaEnlazada;
import A.Comparadores.ComparadorInvertido;
import C.ComparadoresElementoUni.ComparadorCantidadDeAlumnos;

public class Universidad {
    private ListaEnlazada <ElementoUni> elementos;
    private String nombre;

    public Universidad(String nombre){
        this.nombre = nombre;
        this.elementos = new ListaEnlazada<>(new ComparadorCantidadDeAlumnos());
    }

    public void cambiarOrden(Comparator <ElementoUni> comp1){
        this.elementos.setOrden(comp1);
    }

    public void add(ElementoUni e){
        if(!elementos.contains(e))
            elementos.add(e);
    }   

    public void mostrarElementos (){
      this.elementos.showList();
    }
    

}


