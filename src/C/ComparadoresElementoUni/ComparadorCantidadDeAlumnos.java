package C.ComparadoresElementoUni;

import java.util.Comparator;

import C.ElementoUni;

public class ComparadorCantidadDeAlumnos implements Comparator <ElementoUni>{


    @Override
    public int compare(ElementoUni o1, ElementoUni o2) {
        return o2.getCantidadDeAlumnos()-o1.getCantidadDeAlumnos();
    }
}