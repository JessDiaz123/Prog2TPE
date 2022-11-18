package D;

import A.Comparadores.ComparadorInt;
import A.Comparadores.ComparadorInvertido;
import A.Comparadores.ComparadorString;
import A.ListaEnlazada;
import B.Alumno;
import C.ElementoUni;
import C.GrupoUni;
import C.ComparadoresElementoUni.ComparadorCantidadDeAlumnos;

public class Main {

  public static void main(String[] args) {
    // //4 a)

    // ComparadorInt c1 = new ComparadorInt();
    // ListaEnlazada<Integer> l1 = new ListaEnlazada<>(c1);
    // l1.add(10);
    // l1.add(21);
    // l1.add(1);
    // l1.add(5);
    // l1.add(11);

    // //4 b)

    // for(Integer n: l1) {
    // 	System.out.println(n);
    // }
    // System.out.println("=============");

    // //4 c)
    // System.out.println(l1);
    // l1.remove(0);
    // // usando el find para encontrar el numero
    // int posicion = l1.find(5);
    // l1.remove(posicion);
    // //usando el removeAll que directamente lo busca y encuentra.
    // l1.removeAll(11);
    // System.out.println(l1);

    // //String
    // // 4 d)
    // ComparadorString c2 = new ComparadorString();
    // ListaEnlazada<String> ls = new ListaEnlazada<>(c2);

    // ls.add("Facil");
    // ls.add("Es");
    // ls.add("Parcial");
    // ls.add("Prog2");

    // // 4 e)
    // for(String n: ls) {
    //     System.out.println(n);
    // }
    // System.out.println("=============");

    // // 4 f)
    // System.out.println("Posicion de la palabra Parcial: " +ls.find("Parcial"));

    // // 4 g)
    // System.out.println("Posicion de la palabra Recuperatorio" +ls.find("Recuperatorio"));

    // // 4 h)
    // ComparadorInvertido <String> compInv = new ComparadorInvertido<>(new ComparadorString());
    // System.out.println(ls);
    // ls.setOrden(compInv);
    // System.out.println(ls);

    //4 i)
    //Primer estructura 
    
    GrupoUni Uni1 = new GrupoUni("Unicen");

    GrupoUni facuExa = new GrupoUni("Exactas");

    GrupoUni facuHumanas = new GrupoUni("Humanas");

    GrupoUni carreHist = new GrupoUni("Historia");

    Alumno a1 = new Alumno("John", "Doe", 1200000, 76);
    a1.agregarInteres("intercambio");

    Alumno a2 = new Alumno("Federico", "Lopez", 35999888, 35);
    a2.agregarInteres("redes");
    a2.agregarInteres("php");
    a2.agregarInteres("java");
    a2.agregarInteres("python");

    Alumno a3 = new Alumno("Juana", "Garcia", 27123455, 39);
    a3.agregarInteres("programacion");
    a3.agregarInteres("php");
    a3.agregarInteres("java");

    Alumno a4 = new Alumno("Mora", "Diaz", 37124425, 28);
    a4.agregarInteres("psicologia");
    a4.agregarInteres("Freud");

    Alumno a5 = new Alumno("Flora", "Rivas", 34555111, 29);
    a5.agregarInteres("historia");
    a5.agregarInteres("antigua");

    Alumno a6 = new Alumno("Martin", "Gomez", 34111222, 37);
    a6.agregarInteres("romanos");
    a6.agregarInteres("egipcios");
    a6.agregarInteres("griegos");

    Alumno a7 = new Alumno("Roman", "Bazan", 32555111, 36);
    a7.agregarInteres("Argentina");

    Uni1.addElemento(facuExa);
    Uni1.addElemento(facuHumanas);
    Uni1.addElemento(a1);
    facuExa.addElemento(a2);
    facuExa.addElemento(a3);
    facuHumanas.addElemento(carreHist);
    facuHumanas.addElemento(a4);
    carreHist.addElemento(a5);
    carreHist.addElemento(a6);
    carreHist.addElemento(a7);

    // 2da Estructura

    GrupoUni Olimp = new GrupoUni("Olimpiadas Matematicas");    
    
    GrupoUni Matea2 = new GrupoUni("Matea2");    
    GrupoUni LosFibo = new GrupoUni("LosFibo");   
    
    Alumno a8 = new Alumno("Juan", "Juarez", 33222444, 29);
    a5.agregarInteres("sucesiones");
    a5.agregarInteres("algebra");

    Alumno a9 = new Alumno("Julio", "Cesar", 33222111, 33);
    a5.agregarInteres("sucesiones");
    a5.agregarInteres("algebra");

    Alumno a10 = new Alumno("Bernardino", "Rivas", 30987654, 35);
    a5.agregarInteres("matematicas");

    Alumno a11 = new Alumno("Jose", "Paso", 33322112, 25);
    a5.agregarInteres("problemas");

    Alumno a12 = new Alumno("Isaac", "Newton", 12343565, 200);
    a5.agregarInteres("sucesiones");
    
    Olimp.addElemento(Matea2);
    Olimp.addElemento(LosFibo);

    Matea2.addElemento(a8);
    Matea2.addElemento(a9);

    LosFibo.addElemento(a10);
    LosFibo.addElemento(a11);
    LosFibo.addElemento(a12);



    //creo la lista enlazada 
    ComparadorCantidadDeAlumnos c1 = new ComparadorCantidadDeAlumnos();
    ListaEnlazada <ElementoUni> lista = new ListaEnlazada<>(c1);
    
    //agrego los grupos
    lista.add(Uni1);
    lista.add(Olimp);
    
    for(ElementoUni e: lista) {
        System.out.println(e);
    }
    
    
  }
}
