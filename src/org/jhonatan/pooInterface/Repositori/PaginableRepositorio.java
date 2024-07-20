package org.jhonatan.pooInterface.Repositori;

import java.util.List;

import org.jhonatan.pooInterface.Modelo.Cliente;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
