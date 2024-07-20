import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;
import org.jhonatan.pooInterface.Repositori.ClienteListRepositorio;
import org.jhonatan.pooInterface.Repositori.CrudRepositorio;
import org.jhonatan.pooInterface.Repositori.PaginableRepositorio;

public class EjemploRepositorio {
    public static void main(String[] args) throws Exception {

        EjemploRepositorio();
    }

    public static void EjemploRepositorio() {
        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Juana", "Gonzalez"));
        repo.crear(new Cliente("luci", "Martinez"));
        repo.crear(new Cliente("Jhonatan", "Isai"));

        // listamo
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("=====PAGINABLE====");
        List<Cliente> paginable = ((PaginableRepositorio) repo).listar(0, 3);
        paginable.forEach(System.out::println);
    }
}
