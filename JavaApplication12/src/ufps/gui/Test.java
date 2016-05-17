/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.gui;

import ufps.util.Util;

/**
 *
 * @author MADARME
 */
public class Test {
    
    public static void main(String nada[])
    {
    ufps.negocio.MatrizMatematica m=new ufps.negocio.MatrizMatematica("999999","1");
    Util.imprimir(m);
    Util.imprimir("Madarme");
    Util.imprimir(234);
    Util.imprimir(3.4F);
    
    try{
        Util.comparar(234, "234");
    }catch(Exception e)
    {
        System.err.println("Error de conversión de tipos");
    }
    Util.comparar("madarme", "MADARME");
    Util.comparar(3.4F,45.5F);
    
    //m.getSumar();
    //System.out.println(m);
    
    
    
    }
    
}
