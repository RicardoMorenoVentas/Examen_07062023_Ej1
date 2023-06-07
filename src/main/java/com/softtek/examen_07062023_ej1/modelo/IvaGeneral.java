package com.softtek.examen_07062023_ej1.modelo;

public interface IvaGeneral {
    public static double calcularImpuesto(Producto p1){
        return (p1.getPrecio()*((double) 21 /100));
    };
}
