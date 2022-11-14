public class Main {
    public static void main(String[] args) {
        
        Nodo <Integer> n1 = new Nodo<>(1);
        ListaEnlazada<Integer> l1 = new ListaEnlazada<>();

        l1.agregarOrdenado(n1);

        System.out.println(l1);

    }
}
