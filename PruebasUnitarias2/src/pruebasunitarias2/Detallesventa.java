/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias2;

/**
 *
 * @author Sebastian Mera
 */
public class Detallesventa {
    int numProducts;
    float desc;
    P_Unitarias articulo;

    public Detallesventa(int numProducts, float desc, P_Unitarias articulo) {
        this.numProducts = numProducts;
        this.desc = desc;
        this.articulo = articulo;
    }

    public int getNumProducts() {
        return numProducts;
    }

    public void setNumProducts(int numProducts) {
        this.numProducts = numProducts;
    }

    public float getDesc() {
        return desc;
    }

    public void setDesc(float desc) {
        this.desc = desc;
    }

    public P_Unitarias getArticulo() {
        return articulo;
    }

    public void setArticulo(P_Unitarias articulo) {
        this.articulo = articulo;
    }
    //////////////////////////////////////////////////////////////////////
    public float getCosto_T(){
        return articulo.getTotal() * numProducts;
    }
    public float getCosto_Sin_iva(){
        return (float) (getCosto_T() / (1 + 0.16));
    }
    
    public float get_Precio_desc(){
        return getCosto_Sin_iva() * desc;
    }
    
    public float get_iva_c(){
        return articulo.getIva() * getCosto_Sin_iva();
    }
    
    public float getCost_venta(){
        return getCosto_T() - get_Precio_desc();
    }
    public float getDescuento_Red(){
        return Math.round(get_Precio_desc() * 100) / 100f;
    }
    
    public float getIva_Red(){
        return Math.round(get_iva_c() * 100)/100f;
    }
    public float getCostoVenta_Red(){
        return Math.round(getCost_venta() * 100)/100f;
    }
    /////////////////////////////////////////////////////////////
    public String getDesc_s (){
        return String.format("%.2f", getDescuento_Red());
    }
    public String getIva_s (){
        return String.format("%.2f", getIva_Red());
    }
    public String getCosto_T_s (){
        return String.format("%.2f", getCostoVenta_Red());
    }
    
    @Override
    public String toString(){
        return this.getCosto_T_s() + ", " + this.getDesc_s() + ", " + this.getIva_s() + "+ " + this.getCosto_T_s();
    }
    
}
