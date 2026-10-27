/** 
* Problema: Formados en la cafetería 
* Autor: Grifaldo Martínez Katya Valentina
* Grupo: GTID244
* Fecha: 26/10/2025 
* Descripción: En la cafetería de la UAM hay dos colas: la de los alumnos y la de los trabajadores. Cuando es el turno de atender a la siguiente persona, la política de la cafetería es darle preferencia a la gente formada en la cola de los trabajadores; los alumnos son atendidos sólo si no hay trabajadores formados. Con esta información, escribe un programa que procese una secuencia de 
 eventos de los siguientes tipos. 
*/ 

public class Nodo {
    private String nombre;
    private Nodo siguiente;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}