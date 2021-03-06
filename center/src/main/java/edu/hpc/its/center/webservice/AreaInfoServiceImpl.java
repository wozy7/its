
package edu.hpc.its.center.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AreaInfoServiceImpl", targetNamespace = "http://area.its.hpc.edu")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AreaInfoServiceImpl {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllExpInfo", targetNamespace = "http://area.its.hpc.edu", className = "edu.hpc.its.center.webservice.GetAllExpInfo")
    @ResponseWrapper(localName = "getAllExpInfoResponse", targetNamespace = "http://area.its.hpc.edu", className = "edu.hpc.its.center.webservice.GetAllExpInfoResponse")
    @Action(input = "http://area.its.hpc.edu/AreaInfoServiceImpl/getAllExpInfoRequest", output = "http://area.its.hpc.edu/AreaInfoServiceImpl/getAllExpInfoResponse")
    public String getAllExpInfo();

    /**
     * 
     * @param expIds
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLight2Time", targetNamespace = "http://area.its.hpc.edu", className = "edu.hpc.its.center.webservice.GetLight2Time")
    @ResponseWrapper(localName = "getLight2TimeResponse", targetNamespace = "http://area.its.hpc.edu", className = "edu.hpc.its.center.webservice.GetLight2TimeResponse")
    @Action(input = "http://area.its.hpc.edu/AreaInfoServiceImpl/getLight2TimeRequest", output = "http://area.its.hpc.edu/AreaInfoServiceImpl/getLight2TimeResponse")
    public String getLight2Time(
        @WebParam(name = "expIds", targetNamespace = "")
        List<String> expIds);

}
