/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.util;

/**
 *
 * @author MADARME
 */
public class Util {

    public Util() {
    }
    
    
    
    public static <T> void imprimir(T objetoNose)
    {
        System.out.println(objetoNose.toString());
        
        
    }
    
    public static <T> void comparar(T objetoNose, T obj2)
    {
        
        int c=((Comparable)objetoNose).compareTo(obj2);
        if(c==0)
        {
            System.out.println("Obj1 es igual a Obj2");
        }
        else
        {
            if(c<0)
            {
                 System.out.println("Obj1 es menor a Obj2");
            }
            else
            {
                 System.out.println("Obj1 mayor a Obj2");
            }
        }
        
        
    }
    
    
    
    
    
}
