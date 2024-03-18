package server;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import model.AppointmentType;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ServerInterface {
    @WebMethod
    String addAppointment(String appointmentID, AppointmentType appointmentType, int capacity);
    @WebMethod
    String removeAppointment( String appointmentID,  AppointmentType appointmentType);
    @WebMethod
    String bookAppointment( String patientID,  AppointmentType appointmentType,  String appointmentID);
    @WebMethod
    String cancelAppointment( String patientID,  String appointmentID);
    @WebMethod
    String getAppointmentSchedule( String patientID);
    @WebMethod
    String listAppointmentAvailability( String appointmentType);
    @WebMethod
    String swapAppointment( String patientID,  String oldAppointmentType,  String oldAppointmentID,  String newAppointmentType,  String newAppointmentID);
}
