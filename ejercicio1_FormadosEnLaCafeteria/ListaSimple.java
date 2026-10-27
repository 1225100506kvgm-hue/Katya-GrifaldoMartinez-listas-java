/**
 * Problema:Formados en la cafetería
 * Autor: Grifaldo Martínez Katya Valentina
 * Grupo: GTID244
 * Materia: 
 * Fecha: 26/10/2026
 * Descripción: Lista simplemente enlazada que representa una fila de personas.
 * Guarda una referencia al primero y al último nodo para poder formar a
 * alguien al final y atender al primero sin recorrer toda la lista.
 */
public class ListaSimple {
    private Nodo primero;
    private Nodo ultimo;
    private int tamanio;

    public ListaSimple() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void agregarAlFinal(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamanio++;
    }

    public String quitarDelFrente() {
        if (estaVacia()) {
            return null;
        }
        String nombre = primero.getNombre();
        primero = primero.getSiguiente();
        if (primero == null) {
            ultimo = null;
        }
        tamanio--;
        return nombre;
    }
}