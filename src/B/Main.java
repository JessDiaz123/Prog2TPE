package B;

import A.ListaEnlazada;
import A.Comparadores.ComparadorCompuesto;
import B.ComparadoresAlumno.ComparadorApellido;
import B.ComparadoresAlumno.ComparadorDNI;
import B.ComparadoresAlumno.ComparadorEdad;
import B.ComparadoresAlumno.ComparadorNombre;

public class Main {
    public static void main(String []args){
        Alumno a1 = new Alumno("Jesus","Diaz", 33333333, 28, "musica");
        Alumno a2 = new Alumno("Macarena","Diaz", 22222222, 25, "Danza");
        Alumno a3 = new Alumno("Daniel","Mayweather", 22344556, 25, "Boxeo");
        Alumno a4= new Alumno("Florencia","Vivar", 77777777, 29, "Viajar");

        ComparadorApellido CporApellido= new ComparadorApellido();
        ComparadorNombre CporNombre = new ComparadorNombre();
        ComparadorDNI CporDNI = new ComparadorDNI();
        ComparadorEdad CporEdad = new ComparadorEdad();
        ComparadorCompuesto Ccomp = new ComparadorCompuesto<>(CporApellido,CporNombre);
        
        ListaEnlazada<Alumno> l1 = new ListaEnlazada<>(Ccomp);
        
        l1.add(a4);
        l1.add(a3);
        
        l1.showList();
        l1.add(a1);
        l1.add(a2);
        System.out.println("==================");

        for (Alumno a : l1){
            System.out.println(a);
        }

    }
}
