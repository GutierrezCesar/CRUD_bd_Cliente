package com.example.demo.Service;

import com.example.demo.Model.dto.ClienteDto;
import com.example.demo.Model.entity.Clientes;

import java.util.List;

public interface ClienteService {
    List<Clientes> listarTodo();
    Clientes agregarClientes(ClienteDto clienteDto);

    void delete(Clientes clientes);
    Clientes findById(Long id);
}
