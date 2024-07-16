package com.example.demo.Model.dao;

import com.example.demo.Model.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

//proporciona funciones
public interface ClienteDao extends JpaRepository<Clientes,Long> {

}
