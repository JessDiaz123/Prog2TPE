package B.ComparadoresAlumno;

import java.util.Comparator;

import B.Alumno;

public class ComparadorDNI implements Comparator<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getDNI()-o2.getDNI();
    }
}