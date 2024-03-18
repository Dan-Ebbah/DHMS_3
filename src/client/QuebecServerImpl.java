
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
@WebService(name = "QuebecServerImpl", targetNamespace = "http://server/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QuebecServerImpl extends CommonServerImplInterface{


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @Override
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/QuebecServerImpl/getServerNameRequest", output = "http://server/QuebecServerImpl/getServerNameResponse")
    public String getServerName();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @Override
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/QuebecServerImpl/listAppointmentAvailabilityRequest", output = "http://server/QuebecServerImpl/listAppointmentAvailabilityResponse")
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
    @Action(input = "http://server/QuebecServerImpl/getOthersAvailabilityRequest", output = "http://server/QuebecServerImpl/getOthersAvailabilityResponse")
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
    @Action(input = "http://server/QuebecServerImpl/isBookableAndBookedRequest", output = "http://server/QuebecServerImpl/isBookableAndBookedResponse")
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
    @Override
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/QuebecServerImpl/removeAppointmentRequest", output = "http://server/QuebecServerImpl/removeAppointmentResponse")
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
    @Override
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/QuebecServerImpl/bookAppointmentRequest", output = "http://server/QuebecServerImpl/bookAppointmentResponse")
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
    @Override
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/QuebecServerImpl/cancelAppointmentRequest", output = "http://server/QuebecServerImpl/cancelAppointmentResponse")
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
    @Override
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/QuebecServerImpl/getAppointmentScheduleRequest", output = "http://server/QuebecServerImpl/getAppointmentScheduleResponse")
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
    @Override
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/QuebecServerImpl/swapAppointmentRequest", output = "http://server/QuebecServerImpl/swapAppointmentResponse")
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
    @Override
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/QuebecServerImpl/addAppointmentRequest", output = "http://server/QuebecServerImpl/addAppointmentResponse")
    public String addAppointment(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        AppointmentType arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2);

}
