package org.jhonatan.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;

public class EjemplosGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andrez", "Guzman"));

        // optenemos el primer elemento
        Cliente andres = clientes.iterator().next();

        Cliente[] clientesArreglo = { new Cliente("Luci", "Martinez"),
                new Cliente("Andrez", "Guzman") };

        Integer[] enterosArreglo = { 1, 2, 3 };

        System.out.println("===EJEMPLO USANDO EL PRIMER METODO===");
        List<Cliente> clientesLista = fromArrayList(clientesArreglo);

        List<Integer> enterosLista = fromArrayList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        /* Ejemplos */
        System.out.println("===EJEMPLOS USANDO EL SEGUNDO METODO ===");
        List<String> nombres = fromArrayList(new String[] { "Andres",
                "Juan", "Pedro", "Alberto" }, enterosArreglo);
        nombres.forEach(System.out::println);

    }

    /* metodo de tipo generico */
    public static <T> List<T> fromArrayList(T[] c) {
        return Arrays.asList(c);
    }

    /* metodo generico con dos parametros */
    public static <T, G> List<T> fromArrayList(T[] c, G[] g) {
        /* c convierte */
        /* g itera e imprime */
        for (G elemento : g) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

}
