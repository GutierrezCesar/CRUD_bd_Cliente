package com.example.demo.Service.Imp;

import com.example.demo.Model.dao.ClienteDao;
import com.example.demo.Model.dto.ClienteDto;
import com.example.demo.Model.entity.Clientes;
import com.example.demo.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service

public class ClienteServicesImp implements ClienteService {

    //DICE ALEX SOLO MEMORIZA
    @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Clientes> listarTodo() {
        return (List)clienteDao.findAll();//listando los objetos
    }

    @Override
    public Clientes agregarClientes(ClienteDto clienteDto) {
        Clientes clientes = new Clientes();
        clientes.setNombres(clienteDto.getNombres());
        clientes.setApellidos(clienteDto.getApellidos());
        clientes.setNumeroDocumento(clienteDto.getNumeroDocumento());
        clientes.setEmail(clienteDto.getEmail());
        clientes.setCreateAt(new Date());
        return clienteDao.save(clientes);
    }

    @Override
    public void delete(Clientes cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public Clientes findById(Long id) {
        Optional<Clientes> cliente = clienteDao.findById(id);
        return cliente.orElse(null);
    }
}
