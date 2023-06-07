package com.softtek.examen_07062023_ej1.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Factura {
    private Iimpuesto impuesto;
    private List<Producto> productos;

    private String tipo_impuesto = "general";

    public Factura(List<Producto> productos, String tipo_impuesto) {
        this.impuesto = new Iimpuesto();
        this.productos = productos;
        this.tipo_impuesto = tipo_impuesto;
        this.impuesto.setTipo_impuesto(tipo_impuesto);
    }

    public Factura(){
        this.impuesto = new Iimpuesto();
        this.impuesto.setTipo_impuesto("general");
    }

    public String getTipo_impuesto() {
        return tipo_impuesto;
    }

    public void setTipo_impuesto(String tipo_impuesto) {
        this.impuesto.setTipo_impuesto(tipo_impuesto);
        this.tipo_impuesto = tipo_impuesto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double calcularTotalFactura(){
        double total_factura = 0;
        for (Producto p : productos){
            total_factura += impuesto.calcularImpuesto(p) + p.getPrecio();
        }
        return total_factura;
    }
}
