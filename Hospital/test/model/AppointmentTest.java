/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import hosp.model.Patient;
import hosp.model.Appointment;
import hosp.model.Doctor;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Евгений Мартыненко General-zver
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

    /**
     * Тест создания Appointment.
     */
    @Test
    public void testCreateAppointment() {
        System.out.println("testCreateAppointment");
        Date date = new Date(2017,12,19);
        byte[] photo = new byte[1024];
        
        Patient patient = new Patient(1, "Краснов Валерий Филипович", date);
        Doctor doctor = new Doctor(1,"Иванов Иван Иванович", "Терапевт", "112312", photo);
        
        Appointment appointment = new Appointment(1, patient, doctor, date);
        assertEquals(appointment.getId(), 1);
        assertEquals(appointment.getPatient(), patient);
        assertEquals(appointment.getDoctor(), doctor);
        assertEquals(appointment.getDate(), date);
        
        appointment.setId(2);
        assertEquals(appointment.getId(), 2);
        
        Patient patient2 = new Patient(2, "Иванова Валерия Филиповна", date);
        appointment.setPatient(patient2);
        assertEquals(appointment.getPatient(), patient2);
        
        Doctor doctor2 = new Doctor(2,"Сидоров Генадий Антонович", "Терапевт", "112312", photo);
        appointment.setDoctor(doctor2);
        assertEquals(appointment.getDoctor(), doctor2);
        
        Date date1 = new Date(2018,1,1);
        appointment.setDate(date1);
        assertEquals(appointment.getDate(), date1);
       
    }
    
<<<<<<< HEAD
    
=======
>>>>>>> 10d5749793f8b9b700bb96bfda12562f5a7d09f4
    /**
     * Тест проверки равенства/неравенства Appointment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        byte[] photo = new byte[1024];
        Date date = new Date(2017,12,19);
        Date date1 = new Date(2018,1,1);
        Patient patient = new Patient(1, "Краснов Валерий Филипович", date);
        Doctor doctor = new Doctor(1,"Иванов Иван Иванович", "Терапевт", "112312", photo);
        Patient patient2 = new Patient(2, "Иванова Валерия Филиповна", date);
        Doctor doctor2 = new Doctor(2,"Сидоров Геннадий Антонович", "Терапевт", "112312", photo);
        
        Appointment appointment1 = new Appointment(1, patient, doctor, date);        
        Appointment appointment2 = new Appointment(1, patient, doctor, date);
        Appointment appointment3 = new Appointment(2, patient2, doctor2, date1);
        
        assertTrue( appointment1.equals(appointment2)   );
        assertFalse(appointment1.equals(appointment3)   );
        
    }
}
