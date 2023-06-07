package com.softtek.examen_07062023_ej1;

import com.softtek.examen_07062023_ej1.modelo.Factura;
import com.softtek.examen_07062023_ej1.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Examen07062023Ej1Application implements CommandLineRunner {

    @Autowired
    Factura factura;

    public static void main(String[] args) {
        SpringApplication.run(Examen07062023Ej1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pepino",2.54));
        productos.add(new Producto("Agüacate",4.5));
        productos.add(new Producto("Yogurt griego",3.2));

        factura.setProductos(productos);
        System.out.println("Factura con impuesto general " + factura.calcularTotalFactura());
        factura.setTipo_impuesto("reducido");
        System.out.println("Factura con impuesto reducido " + factura.calcularTotalFactura());
    }
}
