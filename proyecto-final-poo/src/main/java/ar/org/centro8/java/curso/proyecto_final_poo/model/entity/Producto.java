package ar.org.centro8.java.curso.proyecto_final_poo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private int id;
    private String nombre;
    private double precioCompra;
    private double  precioVenta;
    private int stock;
}
