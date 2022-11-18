package C;

import java.util.ArrayList;

import A.ListaEnlazada;
import C.ComparadoresElementoUni.ComparadorCantidadDeAlumnos;

public class GrupoUni extends ElementoUni {
    private ArrayList <ElementoUni>elementos;
    private String nombre;


    public GrupoUni(String nombre){
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }

    public ArrayList<ElementoUni> getElementos() {
        return new ArrayList<>(elementos);
    }
    
    
    public void addElemento(ElementoUni e){
        if(!elementos.contains(e))
            elementos.add(e);
    }
    
    
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public int getCantidadDeAlumnos() {
        int cantidad = 0;
        for(ElementoUni e : elementos){
            cantidad+= e.getCantidadDeAlumnos();
        }
        return cantidad;
    }

    @Override
public boolean equals(Object obj) {
  try{
    GrupoUni g = ((GrupoUni)obj);
    return this.getNombre().equals(g.getNombre());
  }
  catch(Exception exc){
    return false;
  }
}

    @Override
    public String toString() {
        return  this.nombre + " Cantidad de alumnos: ("+this.getCantidadDeAlumnos()+")";
    }

}




    