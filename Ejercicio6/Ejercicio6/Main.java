package Ejercicio6;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Clase lista = new Clase();
    Scanner V = new Scanner(System.in);
    boolean X = true;
    int dato;
    while(X) {
        System.out.println("-------MENU------");
        System.out.println("Seleccione una opcion");
        System.out.println("[1]insertar al inicio");
        System.out.println("[2]insertar al final");
        System.out.println("[3]quitar del inicio");
        System.out.println("[4]quitar del final");
        System.out.println("\n[5]quitar un dato en especifico");
        System.out.println("\n[6]mostrar si la lista esta vacia");
        System.out.println("\n[7]mostrar la lista");
        System.out.println("\n[8]salir");     
                 
        
        int opc = V.nextInt();
        switch (opc) {
            case 1:
                System.out.println("inserte un dato");
                dato = V.nextInt();
                lista.InsertarAlInicio(dato);
                break;
            case 2:
                System.out.println("inserte un dato");
                dato = V.nextInt();
                lista.InsertarAlFinal(dato);
                break;
            case 3:
                if (!lista.EstaVacia()) {
                    System.out.println("Dato eliminado: " + lista.EliminarInicio());
                } else {
                    System.out.println("La lista esta vacia");
                }
                break;
            case 4:
                if (!lista.EstaVacia()) {
                    System.out.println("Dato eliminado: " + lista.EliminarFin());
                } else {
                    System.out.println("La lista esta vacia");
                }
                break;
            case 5:
                if (!lista.EstaVacia()) {
                    System.out.println("Ingrese el dato a eliminar");
                    dato = V.nextInt();
                    lista.BorrarNodo(dato);
                } else {
                    System.out.println("La lista esta vacia");
                }
                break;
            case 6:
                if (lista.EstaVacia()) {
                    System.out.println("La lista esta vacia");
                } else {
                    System.out.println("La lista no esta vacia");
                }
                break;
            case 7:
                if (!lista.EstaVacia()) {
                    lista.MostrarLista();
                } else {
                    System.out.println("La lista esta vacia");
                }
                break;
            case 8:
                X = false;
                break;
            default:
                System.out.println("Opcion no valida");
        }
   
    } 
}
}
