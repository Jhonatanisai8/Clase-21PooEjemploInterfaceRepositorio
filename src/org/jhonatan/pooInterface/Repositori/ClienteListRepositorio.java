package org.jhonatan.pooInterface.Repositori;

import java.util.ArrayList;
import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio {

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
            if (cliente.getId().equals(id)) {
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
        this.dataSource.sort((a, b) -> {
            int result = 0;
            if (direccion == Direccion.ASC) {
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
            } else if (direccion == Direccion.DESD) {
                switch (campo) {
                    case "id":
                        result = b.getId().compareTo(a.getId());
                        break;
                    case "nombre":
                        result = b.getNombre().compareTo(a.getNombre());
                        break;
                    case "apellido":
                        result = b.getApellido().compareTo(a.getApellido());
                        break;
                }
            }
            return result;
        });
        return dataSource;

    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

}
