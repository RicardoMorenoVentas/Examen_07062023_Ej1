package com.softtek.examen_07062023_ej1.modelo;

public interface IvaSuperReducido {
    public static double calcularImpuesto(Producto p1){
        return (p1.getPrecio()*((double) 12 /100));
    };
}
