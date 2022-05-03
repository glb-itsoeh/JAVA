package pruebasunitarias2;

/**
 * @author Sebastian Mera
 */
public class P_Unitarias {

    public float getCosto_Uni() {
        return costo_Uni;
    }

    public void setCosto_Uni(float costo_Uni) {
        this.costo_Uni = costo_Uni;
    }

    public float getCosto_Utilidad() {
        return costo_Utilidad;
    }

    public void setCosto_Utilidad(float costo_Utilidad) {
        this.costo_Utilidad = costo_Utilidad;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public int getC_articulo() {
        return C_articulo;
    }

    public void setC_articulo(int C_articulo) {
        this.C_articulo = C_articulo;
    }

    public String getN_articulo() {
        return N_articulo;
    }

    public void setN_articulo(String N_articulo) {
        this.N_articulo = N_articulo;
    }

    float costo_Uni;
    float costo_Utilidad;
    float iva;
    float Total;
    int C_articulo;
    String N_articulo;
    
    public P_Unitarias(float costo_Uni, float costo_Utilidad, float iva, int C_articulo, String N_articulo) {
        this.costo_Uni = costo_Uni;
        this.costo_Utilidad = costo_Utilidad;
        this.iva = iva;
        this.C_articulo = C_articulo;
        this.N_articulo = N_articulo;
    }
    //Metodo para calcular el IVA
     public float Iva(){ 
        this.iva = (this.costo_Uni + this.costo_Utilidad) * this.iva;
        //Se utiliza para redondear al valor entero mas cercano
        return Math.round(this.iva*100f)/100f;
    }
     //Metodo para calcular la UTILIDAD del producto
    public float Utilidad(){
        this.costo_Utilidad = this.costo_Utilidad * this.costo_Uni;
        //Se utiliza para redondear al valor entero mas cercano
        return Math.round(this.costo_Utilidad*100)/100f;
    }
    //Metdodo para dar el valor unitario de un producto
    public float getcostoUnitario(){
        //Se utiliza para redondear al valor entero mas cercano
        return Math.round(this.costo_Uni * 10)/10f;
    }
    //Metodo para calcular el precio total
   public float Total(){
        this.Total = this.iva + this.costo_Utilidad + this.costo_Uni;
        //Se utiliza para redondear al valor entero mas cercano
        return Math.round(this.Total*10)/10f;
    }
}

