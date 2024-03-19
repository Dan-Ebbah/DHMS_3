package server;

import database.HashMapImpl;
import model.Appointment;
import model.AppointmentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.net.SocketException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class ServerImplUnitTest {
    public static final String MTL_APPOINTMENT_ID = "MTLA101112";
    public static final String QUE_APPOINTMENT_ID = "QUEM111023";
    public static final String QUE_APPOINTMENT_WITH_DATA = "QUEM101124";
    public static final String SHE_APPOINTMENT_WITH_DATA = "SHEE111125";
    public static final String VALID_PATIENT_ID = "SHEP4321";
    @Mock
    private Logger _logger;
    @Mock
    private HashMapImpl _hashMapImpl;
    private HashMapImpl _hashMapImplWithData;
    private ServerImpl _server;
    private ServerImpl _serverWithData;

    @BeforeEach
    public void setUp() throws SocketException {
        _server = new ServerImpl(_hashMapImpl, 2, _logger);
        _hashMapImplWithData = new HashMapImpl(setFakeDB());
        _serverWithData = new ServerImpl(_hashMapImplWithData, _logger);
    }

    @Test
    public void addAppointment_withAppointmentAlreadyExists_shouldBeUnsuccessfull() {
        Appointment appointment = new Appointment(MTL_APPOINTMENT_ID, AppointmentType.Dental);
        doReturn(appointment).when(_hashMapImpl).findByAppointmentID(MTL_APPOINTMENT_ID);
        String result = _server.addAppointment(MTL_APPOINTMENT_ID, AppointmentType.Dental, 2);
        assertEquals("Could not add appointment, because appointment seems to already exist", result);
    }


    @Test
    public void addAppointment_withValidInputs_shouldBeSuccessful() {
        doReturn(null).when(_hashMapImpl).findByAppointmentID(MTL_APPOINTMENT_ID);
        String result = _server.addAppointment(MTL_APPOINTMENT_ID, AppointmentType.Dental, 2);
        assertEquals("Successfully added the new appointment", result);
    }

    @Test
    public void removeAppointment_whenAppointmentAlreadyExists_shouldRemoveSuccessfully() {
        String result = _serverWithData.removeAppointment(QUE_APPOINTMENT_WITH_DATA, AppointmentType.Surgeon);
        assertEquals("Appointment has been successfully Removed", result);
    }

    @Test
    public void removeAppointment_whenAppointmentDoesNotExists_shouldNotUnsuccessfull() {
        String result = _serverWithData.removeAppointment(QUE_APPOINTMENT_ID, AppointmentType.Surgeon);
        assertEquals("Appointment does not exist", result);
    }

    @Test
    public void cancelAppointment() {
        String result = _serverWithData.cancelAppointment(VALID_PATIENT_ID, SHE_APPOINTMENT_WITH_DATA);
        assertEquals("Appointment has been successfully cancelled", result);
    }

    @Test
    public void getAppointmentSchedule() {
    }

    @Test
    public void listAppointmentAvailability() {
    }

    @Test
    public void swapAppointment() {
    }

    private ConcurrentHashMap<AppointmentType, HashMap<String, Appointment>> setFakeDB() {
        ConcurrentHashMap<AppointmentType, HashMap<String, Appointment>> hashMap = new ConcurrentHashMap<>();

        java.util.HashMap<String, Appointment> value = new java.util.HashMap<>();
        value.put("MTLA101124", new Appointment("MTLA101124", AppointmentType.Physician, 1));
        hashMap.put(AppointmentType.Physician, value);

        java.util.HashMap<String, Appointment> value2 = new java.util.HashMap<>();
        value2.put(QUE_APPOINTMENT_WITH_DATA, new Appointment(QUE_APPOINTMENT_WITH_DATA, AppointmentType.Surgeon, 1));
        hashMap.put(AppointmentType.Surgeon, value2);

        java.util.HashMap<String, Appointment> value3 = new java.util.HashMap<>();
        Appointment appointment = new Appointment(SHE_APPOINTMENT_WITH_DATA, AppointmentType.Dental, 1);
        appointment.setPatientID(VALID_PATIENT_ID);
        value3.put(SHE_APPOINTMENT_WITH_DATA, appointment);
        hashMap.put(AppointmentType.Dental, value3);

        return hashMap;
    }
}