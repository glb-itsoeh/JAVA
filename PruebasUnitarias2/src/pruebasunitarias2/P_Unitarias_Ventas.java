/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias2;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Mera
 */
public class P_Unitarias_Ventas {
    final ArrayList<Detallesventa> articulo;
    float subT;
    float iva_T;
    float c_Total;
    float descT;
    public P_Unitarias_Ventas(){
        articulo = new ArrayList<>();
    }

    public P_Unitarias_Ventas(ArrayList<Detallesventa> articulo, float subT, float iva_T, float c_Total, float descT) {
        this.articulo = articulo;
        this.subT = 0f;
        this.iva_T = 0f;
        this.c_Total = 0f;
        this.descT = 0f;
    }

    public ArrayList<Detallesventa> getArticulo() {
        return articulo;
    }


    public void setSubT() {
        for(Detallesventa dv : articulo){
        this.subT +=  (dv.getCostoVenta_Red() - dv.getIva_Red() + dv.getDescuento_Red());
        }
    }


    public void setIva_T() {
        for(Detallesventa dv : articulo){
        this.iva_T +=  (dv.getCostoVenta_Red() - dv.getIva_Red() + dv.getDescuento_Red());
        }
    }


    public void setC_Total() {
        for(Detallesventa dv : articulo){
        this.c_Total +=  dv.getCostoVenta_Red();
        }
    }


    public void setDescT() {
        for(Detallesventa dv : articulo){
        this.descT +=  dv.getDescuento_Red();
        }
    }
    public void subtotal(){
        for(Detallesventa dv : articulo){
            this.subT += (dv.getCostoVenta_Red() - dv.getIva_Red() + dv.getDescuento_Red());
        }
    }

    public float getSubT() {
        return subT;
    }

    public float getIva_T() {
        return iva_T;
    }

    public float getC_Total() {
        return c_Total;
    }

    public float getDescT() {
        return descT;
    }
    
}
