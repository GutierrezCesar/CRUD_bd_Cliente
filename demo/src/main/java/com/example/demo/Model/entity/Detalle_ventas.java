package com.example.demo.Model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Table(name = "detalle_ventas")
public class Detalle_ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idDetalle;
    private int cantidad;
    private double precio;
    private double subTotal;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Productos productos;
    @ManyToOne
    @JoinColumn(name= "idVenta", nullable = false)
    private Ventas ventas;



}
