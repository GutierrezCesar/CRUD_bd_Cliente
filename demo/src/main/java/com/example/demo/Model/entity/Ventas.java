package com.example.demo.Model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name = "ventas")
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idVenta;
    private Date fecha;
    private String serie;
    private String numero;
    private double total;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;


    @OneToMany(mappedBy = "idDetalle",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Detalle_ventas> detalleVentas;
}
