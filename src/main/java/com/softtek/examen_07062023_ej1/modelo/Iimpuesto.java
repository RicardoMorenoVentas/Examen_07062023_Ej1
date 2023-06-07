package com.softtek.examen_07062023_ej1.modelo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Iimpuesto implements IvaGeneral, IvaSuperReducido{

    private String tipo_impuesto = "general";
    public double calcularImpuesto(Producto p1){
        if (tipo_impuesto.equals("general")){
            return IvaGeneral.calcularImpuesto(p1);
        }
        return IvaSuperReducido.calcularImpuesto(p1);
    };

    public String getTipo_impuesto() {
        return tipo_impuesto;
    }

    public void setTipo_impuesto(String tipo_impuesto) {
        this.tipo_impuesto = tipo_impuesto;
    }
}
