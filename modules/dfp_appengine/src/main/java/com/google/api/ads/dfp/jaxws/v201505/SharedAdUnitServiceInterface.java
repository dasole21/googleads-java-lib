
package com.google.api.ads.dfp.jaxws.v201505;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       <b>This service is deprecated.</b>
 *       
 *       <p>Service for handling {@link SharedAdUnit} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SharedAdUnitServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SharedAdUnitServiceInterface {


    /**
     * 
     *         <b>This method is deprecated and returns null.
     *         <p>Instead, use {@link InventoryUnitService#getAdUnitsByStatement} filtering on
     *         {@code isSharedByDistributor = true}.
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201505.SharedAdUnitPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
    @RequestWrapper(localName = "getSharedAdUnitsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.SharedAdUnitServiceInterfacegetSharedAdUnitsByStatement")
    @ResponseWrapper(localName = "getSharedAdUnitsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.SharedAdUnitServiceInterfacegetSharedAdUnitsByStatementResponse")
    public SharedAdUnitPage getSharedAdUnitsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         <b>This method is deprecated and is a no-op.</b>
     *         
     *         <p>Performs actions on shared ad unit objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param sharedAdUnitAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of shared ad units
     *         @return the result of the update action, which contains the number of shared ad units
     *         on which the action was performed.
     *       
     * 
     * @param sharedAdUnitAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201505.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
    @RequestWrapper(localName = "performSharedAdUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.SharedAdUnitServiceInterfaceperformSharedAdUnitAction")
    @ResponseWrapper(localName = "performSharedAdUnitActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505", className = "com.google.api.ads.dfp.jaxws.v201505.SharedAdUnitServiceInterfaceperformSharedAdUnitActionResponse")
    public UpdateResult performSharedAdUnitAction(
        @WebParam(name = "sharedAdUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
        SharedAdUnitAction sharedAdUnitAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201505")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}
