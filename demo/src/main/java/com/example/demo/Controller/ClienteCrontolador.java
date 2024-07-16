package com.example.demo.Controller;

import com.example.demo.Model.dto.ClienteDto;
import com.example.demo.Model.entity.Clientes;
import com.example.demo.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//accedemos
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")

public class ClienteCrontolador {
    @Autowired
    private ClienteService clienteService;
    @GetMapping("clientes")//URL
    public List<Clientes> getClientes(){
        List<Clientes> listaClientes = clienteService.listarTodo();
        return listaClientes;
    }

    @PostMapping("clientes")
    public ResponseEntity<Clientes> agregarCliente(@RequestBody ClienteDto clienteDto){
        Clientes clientes = clienteService.agregarClientes(clienteDto);
        return ResponseEntity.ok(clientes);
    }

    @DeleteMapping("clientes/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Clientes cliente = clienteService.findById(id);
        if (cliente != null) {
            clienteService.delete(cliente);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    

}


