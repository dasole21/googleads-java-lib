
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
 *       Provides methods for creating, updating and retrieving {@link ProposalLineItem} objects.
 *       <p>
 *       To use this service, you need to have the new sales management solution
 *       enabled on your network. If you do not see a "Sales" tab in
 *       <a href="https://www.google.com/dfp">DoubleClick for Publishers (DFP)</a>,
 *       you will not be able to use this service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ProposalLineItemServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProposalLineItemServiceInterface {


    /**
     * 
     *         Creates new {@link ProposalLineItem} objects.
     *         
     *         For each proposal line item, the following fields are required:
     *         <ul>
     *         <li>{@link ProposalLineItem#proposalId}</li>
     *         <li>{@link ProposalLineItem#rateCardId}</li>
     *         <li>{@link ProposalLineItem#productId}</li>
     *         <li>{@link ProposalLineItem#name}</li>
     *         <li>{@link ProposalLineItem#startDateTime}</li>
     *         <li>{@link ProposalLineItem#endDateTime}</li>
     *         </ul>
     *         
     *         @param proposalLineItems the proposal line items to create
     *         @return the created proposal line items with their IDs filled in
     *       
     * 
     * @param proposalLineItems
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201605.ProposalLineItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "createProposalLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProposalLineItemServiceInterfacecreateProposalLineItems")
    @ResponseWrapper(localName = "createProposalLineItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProposalLineItemServiceInterfacecreateProposalLineItemsResponse")
    public List<ProposalLineItem> createProposalLineItems(
        @WebParam(name = "proposalLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        List<ProposalLineItem> proposalLineItems)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ProposalLineItemPage} of {@link ProposalLineItem} objects
     *         that satisfy the given {@link Statement#query}.  The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ProposalLineItem#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ProposalLineItem#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ProposalLineItem#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link ProposalLineItem#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link ProposalLineItem#endDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link ProposalLineItem#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link ProposalLineItem#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code useThirdPartyAdServerFromProposal}</td>
     *         <td>{@link ProposalLineItem#useThirdPartyAdServerFromProposal}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code thirdPartyAdServerId}</td>
     *         <td>{@link ProposalLineItem#thirdPartyAdServerId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code customThirdPartyAdServerName}</td>
     *         <td>{@link ProposalLineItem#customThirdPartyAdServerName}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of proposal line items
     *         @return the proposal line items that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201605.ProposalLineItemPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "getProposalLineItemsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProposalLineItemServiceInterfacegetProposalLineItemsByStatement")
    @ResponseWrapper(localName = "getProposalLineItemsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProposalLineItemServiceInterfacegetProposalLineItemsByStatementResponse")
    public ProposalLineItemPage getProposalLineItemsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link ProposalLineItem} objects that match
     *         the given {@link Statement#query}.
     *         
     *         @param proposalLineItemAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter a set of
     *         proposal line items
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param proposalLineItemAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201605.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "performProposalLineItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProposalLineItemServiceInterfaceperformProposalLineItemAction")
    @ResponseWrapper(localName = "performProposalLineItemActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProposalLineItemServiceInterfaceperformProposalLineItemActionResponse")
    public UpdateResult performProposalLineItemAction(
        @WebParam(name = "proposalLineItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        ProposalLineItemAction proposalLineItemAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ProposalLineItem} objects. If free editing mode is enabled,
     *         this will trigger inventory reservation and cause the proposal to be pushed to DFP again.
     *         
     *         @param proposalLineItems the proposal line items to update
     *         @return the updated proposal line items
     *       
     * 
     * @param proposalLineItems
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201605.ProposalLineItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "updateProposalLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProposalLineItemServiceInterfaceupdateProposalLineItems")
    @ResponseWrapper(localName = "updateProposalLineItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProposalLineItemServiceInterfaceupdateProposalLineItemsResponse")
    public List<ProposalLineItem> updateProposalLineItems(
        @WebParam(name = "proposalLineItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        List<ProposalLineItem> proposalLineItems)
        throws ApiException_Exception
    ;

}
