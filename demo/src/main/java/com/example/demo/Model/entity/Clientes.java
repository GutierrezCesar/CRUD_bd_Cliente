package com.example.demo.Model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
@ToString @Entity @Table(name = "clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idCliente;
    private String nombres;
    private String apellidos;
    private String numeroDocumento;
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @OneToMany(mappedBy = "idVenta")
    private List<Ventas> venta;

}
