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

        List<Cliente> clientesLista = fromArrayList(clientesArreglo);

        List<Integer> enterosLista = fromArrayList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

    }

    /* metodo de tipo generico */
    public static <T> List<T> fromArrayList(T[] c) {
        return Arrays.asList(c);
    }

}
