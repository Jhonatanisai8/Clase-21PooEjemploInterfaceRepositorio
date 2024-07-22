package org.jhonatan.pooInterface.Repositori;

import java.util.ArrayList;
import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;

public class ClienteListRepositorio implements OrdenablePaginableCrud {

    private List<Cliente> dataSource;

    // constructor
    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente c = null;
        for (Cliente cliente : dataSource) {
            if (cliente.getId() != null && cliente.getId().equals(id)) {
                c = cliente;
                break;
            }
        }
        return c;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        // Cliente c = ;this.porId(id)
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        List<Cliente> listOOrdenada = new ArrayList<>(this.dataSource);
        listOOrdenada.sort((a, b) -> {
            int result = 0;
            if (direccion == Direccion.ASC) {
                result = ordenar(campo, a, b);
            } else if (direccion == Direccion.DESD) {
                result = ordenar(campo, b, a);
            }
            return result;

        });
        return listOOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    static int ordenar(String campo, Cliente a, Cliente b) {

        int result = 0;
        switch (campo) {
            case "id":
                result = a.getId().compareTo(b.getId());
                break;
            case "nombre":
                result = a.getNombre().compareTo(b.getNombre());
                break;
            case "apellido":
                result = a.getApellido().compareTo(b.getApellido());
                break;
        }
        return result;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

}
