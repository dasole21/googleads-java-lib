
package com.google.api.ads.dfp.jaxws.v201605;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BaseRateService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201605/BaseRateService?wsdl")
public class BaseRateService
    extends Service
{

    private final static URL BASERATESERVICE_WSDL_LOCATION;
    private final static WebServiceException BASERATESERVICE_EXCEPTION;
    private final static QName BASERATESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201605", "BaseRateService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201605/BaseRateService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BASERATESERVICE_WSDL_LOCATION = url;
        BASERATESERVICE_EXCEPTION = e;
    }

    public BaseRateService() {
        super(__getWsdlLocation(), BASERATESERVICE_QNAME);
    }

    public BaseRateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns BaseRateServiceInterface
     */
    @WebEndpoint(name = "BaseRateServiceInterfacePort")
    public BaseRateServiceInterface getBaseRateServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201605", "BaseRateServiceInterfacePort"), BaseRateServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BaseRateServiceInterface
     */
    @WebEndpoint(name = "BaseRateServiceInterfacePort")
    public BaseRateServiceInterface getBaseRateServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201605", "BaseRateServiceInterfacePort"), BaseRateServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BASERATESERVICE_EXCEPTION!= null) {
            throw BASERATESERVICE_EXCEPTION;
        }
        return BASERATESERVICE_WSDL_LOCATION;
    }

}
