package C;

import A.Comparadores.ComparadorInvertido;
import B.Alumno;
import C.ComparadoresElementoUni.ComparadorCantidadDeAlumnos;

public class Main {
    public static void main(String[] args) {
    
    GrupoUni facultad1 = new GrupoUni("Facultad Exactas");
    GrupoUni facultad2 = new GrupoUni("Facultad Economicas");
    GrupoUni facultad3 = new GrupoUni("Facultad Humanas");
    
    GrupoUni carrera1= new GrupoUni("Tudai");
    GrupoUni carrera2= new GrupoUni("Tuari");
    GrupoUni carrera3= new GrupoUni("Ingenieria en Sistemas");
    
    GrupoUni carrera4= new GrupoUni("Profesorado de Historia");
    
    Alumno a1 = new Alumno("pepe", "aaaa", 123123123, 21);
    Alumno a2 = new Alumno("pepe", "bbbb", 34543554, 21);
    Alumno a3 = new Alumno("juan", "cccc", 657567, 21);
    Alumno a4 = new Alumno("jose", "dddd", 657567, 21);
    Alumno a5 = new Alumno("Ana", "ababa", 657567, 21);
    Alumno a6 = new Alumno("Beatriz", "kkkkkk", 657567, 21);

    Universidad uni1= new Universidad("Unicen");
    
    //Añado las 3 facultades
    uni1.add(facultad1);
    uni1.add(facultad2);
    uni1.add(facultad3);

    //Facultad de exactas tiene 3 alumnos
    facultad1.addElemento(carrera1);
    facultad1.addElemento(carrera2);
    facultad1.addElemento(carrera3);
    
    facultad1.addElemento(a1);
    carrera1.addElemento(a2);
    carrera1.addElemento(a3);

    
    // Facultad Humanas 1 alumnos
    facultad3.addElemento(carrera4);
    carrera4.addElemento(a6);
    
    // Facultad Economicas 2 alumnos
    facultad2.addElemento(a4);
    facultad2.addElemento(a5);


    System.out.println("==============");
    uni1.mostrarElementos();
    System.out.println("==============");
    System.out.println("Cambiando orden");
    ComparadorInvertido <ElementoUni> comp1 =new ComparadorInvertido<>(new ComparadorCantidadDeAlumnos()); 
    uni1.cambiarOrden(comp1);
    uni1.mostrarElementos();


    }
}
