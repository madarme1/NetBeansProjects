
package ejemplo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para esPrimo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="esPrimo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esPrimo", propOrder = {
    "parameter"
})
public class EsPrimo {

    protected int parameter;

    /**
     * Obtiene el valor de la propiedad parameter.
     * 
     */
    public int getParameter() {
        return parameter;
    }

    /**
     * Define el valor de la propiedad parameter.
     * 
     */
    public void setParameter(int value) {
        this.parameter = value;
    }

}
