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
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idProducto;
    private String descripcion;
    private int cantidad;
    private byte estado;

    @OneToMany(mappedBy = "idDetalle")
    private List<Detalle_ventas> detalleVentas ;

}
