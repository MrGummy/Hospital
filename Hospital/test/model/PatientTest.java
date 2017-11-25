/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import hosp.model.Patient;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Glover
 */
public class PatientTest {
    
    public PatientTest() {
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
     * Тест создания Patient.
     */
    @Test
    public void testCreatePatient() {
        System.out.println("test Patient createPatient");
        Date date = new Date(2017, 9, 26);
        Patient patient = new Patient(1, "FIO", date);
        assertEquals(patient.getId(), 1);
        assertEquals(patient.getFio(), "FIO");
        assertEquals(patient.getBirth_date(), date);
        
        patient.setId(2);
        assertEquals(patient.getId(), 2);
        
        patient.setFio("Краснов Валерий Филипович");
        assertEquals(patient.getFio(), "Краснов Валерий Филипович");
        
        date = new Date(2018, 1, 1);
        patient.setBirth_date(date);
        assertEquals(patient.getBirth_date(), date);
    }

    /**
     * Тест проверки равенства/неравенства Patient.
     */
    @Test
    public void testEquals() {
        System.out.println("test Patient equals");
        Date date = new Date(2017, 9, 26);
        Patient patient1 = new Patient(1, "FIO", date);        
        Patient patient2 = new Patient(1, "FIO", date);
        Patient patient3 = new Patient(2, "Краснов Валерий Филипович", date);

        assertTrue( patient1.equals(patient2)   );
        assertFalse(patient1.equals(patient3)   );
    }
}
