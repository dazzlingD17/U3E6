package Ejercicio6;

public class Nodo {

    int dato;
    Nodo siguiente;

    public Nodo(int dato, Nodo n) {
        this.dato = dato;
        this.siguiente = n;
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
