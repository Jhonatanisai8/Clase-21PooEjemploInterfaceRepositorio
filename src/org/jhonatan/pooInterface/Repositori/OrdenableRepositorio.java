package org.jhonatan.pooInterface.Repositori;

import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion direccion);

}
