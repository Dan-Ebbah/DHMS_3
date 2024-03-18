
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.*;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SherbrookeServerImplService", targetNamespace = "http://server/", wsdlLocation = "http://localhost:8082/server/sherbrooke/?wsdl")
public class SherbrookeServerImplService
    extends Service
{

    private final static URL SHERBROOKESERVERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHERBROOKESERVERIMPLSERVICE_EXCEPTION;
    private final static QName SHERBROOKESERVERIMPLSERVICE_QNAME = new QName("http://server/", "SherbrookeServerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8082/server/sherbrooke/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHERBROOKESERVERIMPLSERVICE_WSDL_LOCATION = url;
        SHERBROOKESERVERIMPLSERVICE_EXCEPTION = e;
    }

    public SherbrookeServerImplService() {
        super(__getWsdlLocation(), SHERBROOKESERVERIMPLSERVICE_QNAME);
    }

    public SherbrookeServerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHERBROOKESERVERIMPLSERVICE_QNAME, features);
    }

    public SherbrookeServerImplService(URL wsdlLocation) {
        super(wsdlLocation, SHERBROOKESERVERIMPLSERVICE_QNAME);
    }

    public SherbrookeServerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHERBROOKESERVERIMPLSERVICE_QNAME, features);
    }

    public SherbrookeServerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SherbrookeServerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SherbrookeServerImpl
     */
    @WebEndpoint(name = "SherbrookeServerImplPort")
    public SherbrookeServerImpl getSherbrookeServerImplPort() {
        return super.getPort(new QName("http://server/", "SherbrookeServerImplPort"), SherbrookeServerImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SherbrookeServerImpl
     */
    @WebEndpoint(name = "SherbrookeServerImplPort")
    public SherbrookeServerImpl getSherbrookeServerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "SherbrookeServerImplPort"), SherbrookeServerImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHERBROOKESERVERIMPLSERVICE_EXCEPTION!= null) {
            throw SHERBROOKESERVERIMPLSERVICE_EXCEPTION;
        }
        return SHERBROOKESERVERIMPLSERVICE_WSDL_LOCATION;
    }

}