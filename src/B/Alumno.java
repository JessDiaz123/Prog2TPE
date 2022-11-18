package B;

import java.util.ArrayList;

import C.ElementoUni;

public class Alumno extends ElementoUni{

  private String nombre;
  private String apellido;
  private int DNI;
  private int edad;
  private ArrayList<String> listaDeIntereses;

  public Alumno(String nombre, String apellido, int dNI, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    DNI = dNI;
    this.edad = edad;
    this.listaDeIntereses = new ArrayList<>();
  }

  public Alumno(String nombre, String apellido, int dNI, int edad, String i) {
    this.nombre = nombre;
    this.apellido = apellido;
    DNI = dNI;
    this.edad = edad;
    this.listaDeIntereses = new ArrayList<>();
    this.agregarInteres(i);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getDNI() {
    return DNI;
  }

  public void setDNI(int dNI) {
    DNI = dNI;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public ArrayList<String> getListaDeIntereses() {
    return new ArrayList<>(listaDeIntereses);
  }

  public void agregarInteres(String interesNuevo) {
    if (!listaDeIntereses.contains(interesNuevo)) listaDeIntereses.add(
      interesNuevo
    );
  }

@Override
public String toString() {
    return "           Alumno: "+ nombre + apellido;
}

@Override
public int getCantidadDeAlumnos() {
  return 1;
}

@Override
public boolean equals(Object obj) {
  try{
    int documento = ((Alumno)obj).getDNI();
    return this.DNI == documento;
  }
  catch(Exception exc){
    return false;
  }
}


}
