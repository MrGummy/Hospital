/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Евгений Мартыненко L
 */
public class AppointmentTest {
    
    public AppointmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

      @Test
    public void testCreateAppointment() {
        System.out.println("test Appointment createAppointment");
        Date date = new Date(2017, 9, 26);
        Appointment appointment = new Appointment(1, 1, 1,date, 1);
        assertEquals(appointment.getId(), 1);
        assertEquals(appointment.getPatient_id(), 1);
        assertEquals(appointment.getDoctor_id(), 1);
        assertEquals(appointment.getDate(), date);
        assertEquals(appointment.getState_id(), 1);
        
        appointment.setId(2);
        assertEquals(appointment.getId(), 2);
        
        appointment.setPatient_id(2);
        assertEquals(appointment.getPatient_id(), 2);
        
        appointment.setDoctor_id(2);
        assertEquals(appointment.getDoctor_id(), 2);
        
        date = new Date(2018, 1, 1);
        appointment.setDate(date);
        assertEquals(appointment.getDate(), date);
        
        appointment.setState_id(2);
        assertEquals(appointment.getState_id(), 2);
    }

    /**
     * Тест проверки равенства/неравенства Appointment.
     */
    @Test
    public void testEquals() {
        System.out.println("test Appointment equals");
        Date date = new Date(2017, 9, 26);
        Appointment appointment1 = new Appointment(1, 1, 1, date, 1);        
        Appointment appointment2 = new Appointment(1, 1, 1, date, 1);
        Appointment appointment3 = new Appointment(2, 2, 1, date, 1);

        assertTrue( appointment1.equals(appointment2)   );
        assertFalse(appointment1.equals(appointment3)   );
    }

}
