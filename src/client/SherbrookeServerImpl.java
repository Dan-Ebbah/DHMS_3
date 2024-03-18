
package client;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SherbrookeServerImpl", targetNamespace = "http://server/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SherbrookeServerImpl {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/getServerNameRequest", output = "http://server/SherbrookeServerImpl/getServerNameResponse")
    public String getServerName();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/listAppointmentAvailabilityRequest", output = "http://server/SherbrookeServerImpl/listAppointmentAvailabilityResponse")
    public String listAppointmentAvailability(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/getOthersAvailabilityRequest", output = "http://server/SherbrookeServerImpl/getOthersAvailabilityResponse")
    public String getOthersAvailability(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/isBookableAndBookedRequest", output = "http://server/SherbrookeServerImpl/isBookableAndBookedResponse")
    public boolean isBookableAndBooked(
        @WebParam(name = "arg0", partName = "arg0")
        UdpServerInfo arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/removeAppointmentRequest", output = "http://server/SherbrookeServerImpl/removeAppointmentResponse")
    public String removeAppointment(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        AppointmentType arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/bookAppointmentRequest", output = "http://server/SherbrookeServerImpl/bookAppointmentResponse")
    public String bookAppointment(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        AppointmentType arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/cancelAppointmentRequest", output = "http://server/SherbrookeServerImpl/cancelAppointmentResponse")
    public String cancelAppointment(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/getAppointmentScheduleRequest", output = "http://server/SherbrookeServerImpl/getAppointmentScheduleResponse")
    public String getAppointmentSchedule(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/swapAppointmentRequest", output = "http://server/SherbrookeServerImpl/swapAppointmentResponse")
    public String swapAppointment(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/SherbrookeServerImpl/addAppointmentRequest", output = "http://server/SherbrookeServerImpl/addAppointmentResponse")
    public String addAppointment(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        AppointmentType arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2);

}
