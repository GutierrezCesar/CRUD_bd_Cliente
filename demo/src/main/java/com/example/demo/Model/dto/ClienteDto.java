package com.example.demo.Model.dto;

import com.example.demo.Model.entity.Ventas;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDto {
    private Long idCliente;
    private String nombres;
    private String apellidos;
    private String numeroDocumento;
    private String email;
    private Date createAt;

    private List<Ventas> venta;
}
