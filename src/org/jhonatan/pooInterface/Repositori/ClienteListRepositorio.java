package org.jhonatan.pooInterface.Repositori;

import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio {

    @Override
    public List<Cliente> listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public Cliente porId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'porId'");
    }

    @Override
    public void crear(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crear'");
    }

    @Override
    public void editar(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }

    @Override
    public void eliminar(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

}
