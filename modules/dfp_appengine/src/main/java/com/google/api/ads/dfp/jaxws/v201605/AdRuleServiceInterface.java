
package com.google.api.ads.dfp.jaxws.v201605;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link AdRule} objects.
 *       
 *       <p>Ad rules contain data that the ad server uses to generate a playlist of
 *       video ads.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdRuleServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdRuleServiceInterface {


    /**
     * 
     *         Creates new {@link AdRule} objects.
     *         
     *         @param adRules the ad rules to create
     *         @return the created ad rules with their IDs filled in
     *       
     * 
     * @param adRules
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201605.AdRule>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "createAdRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdRuleServiceInterfacecreateAdRules")
    @ResponseWrapper(localName = "createAdRulesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdRuleServiceInterfacecreateAdRulesResponse")
    public List<AdRule> createAdRules(
        @WebParam(name = "adRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        List<AdRule> adRules)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link AdRulePage} of {@link AdRule} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdRule#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdRule#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code priority}</td>
     *         <td>{@link AdRule#priority}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdRule#status}</td>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of ad rules
     *         @return the ad rules that match the given filter
     *         @throws ApiException if the ID of the active network does not exist or
     *         there is a backend error
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201605.AdRulePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "getAdRulesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdRuleServiceInterfacegetAdRulesByStatement")
    @ResponseWrapper(localName = "getAdRulesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdRuleServiceInterfacegetAdRulesByStatementResponse")
    public AdRulePage getAdRulesByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link AdRule} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param adRuleAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of ad rules
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param adRuleAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201605.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "performAdRuleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdRuleServiceInterfaceperformAdRuleAction")
    @ResponseWrapper(localName = "performAdRuleActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdRuleServiceInterfaceperformAdRuleActionResponse")
    public UpdateResult performAdRuleAction(
        @WebParam(name = "adRuleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        AdRuleAction adRuleAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link AdRule} objects.
     *         
     *         @param adRules the ad rules to update
     *         @return the updated ad rules
     *         @throws ApiException if there is an error updating the ad rules
     *       
     * 
     * @param adRules
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201605.AdRule>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "updateAdRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdRuleServiceInterfaceupdateAdRules")
    @ResponseWrapper(localName = "updateAdRulesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdRuleServiceInterfaceupdateAdRulesResponse")
    public List<AdRule> updateAdRules(
        @WebParam(name = "adRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        List<AdRule> adRules)
        throws ApiException_Exception
    ;

}
