
package ejemplo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejemplo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EsPrimo_QNAME = new QName("http://Ejemplo/", "esPrimo");
    private final static QName _EsPrimoResponse_QNAME = new QName("http://Ejemplo/", "esPrimoResponse");
    private final static QName _Hello_QNAME = new QName("http://Ejemplo/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://Ejemplo/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejemplo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link EsPrimo }
     * 
     */
    public EsPrimo createEsPrimo() {
        return new EsPrimo();
    }

    /**
     * Create an instance of {@link EsPrimoResponse }
     * 
     */
    public EsPrimoResponse createEsPrimoResponse() {
        return new EsPrimoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsPrimo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ejemplo/", name = "esPrimo")
    public JAXBElement<EsPrimo> createEsPrimo(EsPrimo value) {
        return new JAXBElement<EsPrimo>(_EsPrimo_QNAME, EsPrimo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsPrimoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ejemplo/", name = "esPrimoResponse")
    public JAXBElement<EsPrimoResponse> createEsPrimoResponse(EsPrimoResponse value) {
        return new JAXBElement<EsPrimoResponse>(_EsPrimoResponse_QNAME, EsPrimoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ejemplo/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ejemplo/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
