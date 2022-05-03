/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias2;

import java.util.ArrayList;
import pruebasunitarias2.P_Unitarias_Ventas;
import pruebasunitarias2.Detallesventa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Mera
 */
public class P_UnitariasTest {
    
    public P_UnitariasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of testCaso1 method, of class P_Unitarias.
     */@Test
     public void tedtVentas (){
       P_Unitarias Art_1 = new P_Unitarias(12.5f, 0.13f, 0.16f, 112233, "CocaCola");
       P_Unitarias Art_2 = new P_Unitarias(12.5f, 0.13f, 0.16f, 784596456, "Coca Cola");
       P_Unitarias Art_3 = new P_Unitarias(12.51f, 0.15f, 0.16f, 778899, "Sprite");
       
       Detallesventa dv1 = new Detallesventa(100, 0.05f, Art_1);
       Detallesventa dv2 = new Detallesventa(50, 0f, Art_2);
       Detallesventa dv3 = new Detallesventa(10, 0.03f, Art_3);
       
       ArrayList <Detallesventa> articulos= new ArrayList();
       articulos.add(dv1);
       articulos.add(dv2);
       articulos.add(dv3);
       
       P_Unitarias_Ventas ven = new P_Unitarias_Ventas(articulos, 2264.66f, 362.34f, 2551.99f, 75.01f);
       ven.setC_Total();
       ven.subtotal();
       ven.setIva_T();
       ven.setDescT();
       
        assertEquals(2264.66f, ven.getSubT(),2264.66f);
        assertEquals(362.34f, ven.getIva_T(),362.34f);
        assertEquals(75.01f, ven.getDescT(),75.01f);
        assertEquals(2551.99f, ven.getC_Total(),2551.99f);
        
    }

   /* public void testCaso1(){
        P_Unitarias se = new P_Unitarias(12.5f, 0.13f, 0.16f, 112233, "CocaCola");
        assertEquals(12.5f, se.getcostoUnitario(),0.0);
        assertEquals(1.63f, se.Utilidad(),0.0);
        assertEquals(2.26f, se.Iva(),0.0);
        assertEquals(16.40f, se.Total(),0.0);
    }
    
    public void testCaso2(){
        P_Unitarias instance = new P_Unitarias(12.5f, 0.13f, 0.16f, 784596456, "Coca Cola");
        
        assertEquals(12.5f,instance.getcostoUnitario(),0.0f);
        assertEquals(1.63f, instance.Utilidad(),0.0f);
        assertEquals(2.26f, instance.Iva(),0.00f);
        assertEquals(16.40f, instance.Total(),0.0f);
    }
   
    public void testCaso3(){
        P_Unitarias se = new P_Unitarias(12.51f, 0.15f, 0.16f, 778899, "Sprite");
        assertEquals(12.5f, se.getcostoUnitario(),0.0);
        assertEquals(1.88f, se.Utilidad(),0.0);
        assertEquals(2.30f, se.Iva(),0.0);
        assertEquals(16.70f, se.Total(),0.0);
    }/*/
    
    
}
