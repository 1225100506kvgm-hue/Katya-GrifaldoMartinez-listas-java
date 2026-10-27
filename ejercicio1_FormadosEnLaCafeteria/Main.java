/**
 * Problema:Formados en la cafetería
 * Autor: Grifaldo Martínez Katya Valentina
 * Grupo: GTID244
 * Fecha: 26/10/2026
 * Descripción: Procesa los eventos de llegada y atención usando dos listas
 *              simples, una para alumnos y otra para trabajadores.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ListaSimple alumnos = new ListaSimple();
        ListaSimple trabajadores = new ListaSimple();

        StringBuilder salida = new StringBuilder();

        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            String evento = teclado.next();

            if (evento.equals("LLEGA")) {
                String tipo = teclado.next();
                String nombre = teclado.next();

                if (tipo.equals("ALUMNO")) {
                    alumnos.agregarAlFinal(nombre);
                } else {
                    trabajadores.agregarAlFinal(nombre);
                }
            } else {
                if (!trabajadores.estaVacia()) {
                    salida.append(trabajadores.quitarDelFrente()).append("\n");
                } else {
                    salida.append(alumnos.quitarDelFrente()).append("\n");
                }
            }
        }

        System.out.print(salida);
    }
}