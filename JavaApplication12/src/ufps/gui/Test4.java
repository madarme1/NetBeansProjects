/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.gui;
import javax.swing.JOptionPane;
/**
 *
 * @author MADARME
 */
public class Test4 {
    
    
    public static void main(String nada[])
    {
        int v[]={3,4,5,6,7,8,9,10};
        
        try{
            int indice=Integer.parseInt(JOptionPane.showInputDialog("Ingrese indice: "));
            JOptionPane.showMessageDialog(null, v[indice], ":)", 1);
        }catch(java.lang.NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Digito un caracter inválido", "Error", 0);
        }catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
        JOptionPane.showMessageDialog(null, "Índice no válido", "Error", 0);
        }
        
    }
    
}
