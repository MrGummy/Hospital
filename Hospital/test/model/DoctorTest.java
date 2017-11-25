/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class DoctorTest {
    
    public DoctorTest() {
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
     * Тест создания Doctor.
     */
    @Test
    public void testCreateDoctor() {
        System.out.println("testCreateDoctor");
        byte[] photo = new byte[1024];
        Doctor doctor = new Doctor(1,"Ivanov Ivan Ioanovich", "Terapevt", "112312", photo);
        assertEquals(doctor.getId(), 1);
        assertEquals(doctor.getFio(), "Ivanov Ivan Ioanovich");
        assertEquals(doctor.getSpecialization(), "Terapevt");
        assertEquals(doctor.getNumber_phone(), "112312");
        assertEquals(doctor.getPhoto(), photo);
        
        doctor.setId(2);
        assertEquals(doctor.getId(), 2);
        
        doctor.setFio("Chulenko LOL KEK");
        assertEquals(doctor.getFio(), "Chulenko LOL KEK");
        
        doctor.setSpecialization("Khirurg");
        assertEquals(doctor.getSpecialization(), "Khirurg");
        
        doctor.setNumber_phone("159123");
        assertEquals(doctor.getNumber_phone(), "159123");
       
        doctor.setPhoto(photo);
        assertEquals(doctor.getPhoto(), photo);
    }

    /**
     * Тест проверки равенства/неравенства Doctor.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        byte[] photo = new byte[1024];
        Doctor doctor1 = new Doctor(1,"Иванов Иван Иванович", "Терапевт", "112312", photo);        
        Doctor doctor2 = new Doctor(1,"Иванов Иван Иванович", "Терапевт", "112312", photo);
        Doctor doctor3 = new Doctor(2,"Степанов Степан Степанович", "Стоматолог", "666666", photo);
        
        assertTrue(doctor1.equals(doctor2));
        assertFalse(doctor1.equals(doctor3));

    }
}
