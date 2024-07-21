package org.jhonatan.pooInterface.Repositori;

import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;

public interface CrudRepositorio {
    List<Cliente> listar();

    Cliente porId(Integer id);

    void crear(Cliente cliente);

    void editar(Cliente cliente);

    void eliminar(Integer id);
    
}
