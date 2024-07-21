import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;
import org.jhonatan.pooInterface.Repositori.ClienteListRepositorio;
import org.jhonatan.pooInterface.Repositori.Direccion;
import org.jhonatan.pooInterface.Repositori.OrdenablePaginableCrud;

public class EjemploRepositorio {
    public static void main(String[] args) throws Exception {
        EjemploRepositorio.EjemploRepositorio1();
    }

    static void EjemploRepositorio1() {
        OrdenablePaginableCrud repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Andrez", "Gonzalez"));
        repo.crear(new Cliente("luci", "Martinez"));
        repo.crear(new Cliente("Jhonatan", "Isai"));

        // listamo
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("=====PAGINABLE====");
        List<Cliente> paginable = repo.listar(0, 3);
        paginable.forEach(System.out::println);

        System.out.println("=====ORDENAR=====");
        List<Cliente> clientesOrdenable = repo.listar("nombre", Direccion.DESD);
        for (Cliente cliente : clientesOrdenable) {
            System.out.println(cliente);
        }

        System.out.println("===EDITAR===");
        Cliente luciActualizar = new Cliente("Bea", "Perez");
        luciActualizar.setId(1);
        repo.editar(luciActualizar);
        Cliente bea = repo.porId(1);
        System.out.println(bea);
        System.out.println("=========");
        repo.listar("nombre", Direccion.DESD).forEach(System.out::println);

        // System.out.println("==ELIMINAR==");
        // repo.eliminar(1);

        System.out.println("LISTA");
        repo.listar().forEach(System.out::println);

    }
}
