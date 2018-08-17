
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _ServicePayment_QNAME = new QName("http://service/", "servicePayment");
    private final static QName _ServicePaymentResponse_QNAME = new QName("http://service/", "servicePaymentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServicePayment }
     * 
     */
    public ServicePayment createServicePayment() {
        return new ServicePayment();
    }

    /**
     * Create an instance of {@link ServicePaymentResponse }
     * 
     */
    public ServicePaymentResponse createServicePaymentResponse() {
        return new ServicePaymentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "servicePayment")
    public JAXBElement<ServicePayment> createServicePayment(ServicePayment value) {
        return new JAXBElement<ServicePayment>(_ServicePayment_QNAME, ServicePayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "servicePaymentResponse")
    public JAXBElement<ServicePaymentResponse> createServicePaymentResponse(ServicePaymentResponse value) {
        return new JAXBElement<ServicePaymentResponse>(_ServicePaymentResponse_QNAME, ServicePaymentResponse.class, null, value);
    }

}
