/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.negocio;

/**
 *
 * @author MADARME
 */
public class MatrizMatematica {
    
    private byte matriz[][];

    public MatrizMatematica() {
    }
    
     public MatrizMatematica(String x, String y) {
         
         int cantCols=x.length()>=y.length()?x.length():y.length();
         this.matriz=new byte[3][cantCols+1];
         llenar(x, this.matriz[0]);
         llenar(y, this.matriz[1]);
         
         
    }
    
     
     private void llenar(String numero, byte vector[])
     {
     int i=vector.length-1;
     int i_letras=numero.length()-1;
     
     while(i>=0)
     {
         
         if(i_letras>=0)
         {
         vector[i]=Byte.parseByte(numero.charAt(i_letras)+"");
         }
         else
             break;
         
      i--;
      i_letras--;
         
     }
     
     
     }
     
     
     
     public void getSumar()
     {
         
       byte llevo=0;
       for(int i=this.matriz[0].length-1;i>=0;i--)
       {
       int suma=this.matriz[0][i]+this.matriz[1][i]+llevo;
       this.matriz[2][i]=(byte)(suma%10);
       llevo=(byte)(suma/10);
       
       }
         
     
     }
     
     
     
     
     
     public String toString()
     {
     String msg="";
        for(byte vector[]:this.matriz)
        {
            for(byte dato: vector)
            {
                msg+=dato+"";
            }
            msg+="\n";
        }
     return (msg);
     }
    
    
    
}
