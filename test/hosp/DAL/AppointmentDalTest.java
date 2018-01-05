/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.DAL;

import hosp.model.Appointment;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Евгений Мартыненко L
 */
public class AppointmentDalTest {
    
    public AppointmentDalTest() {
    }
    /**
     * Test of selectAll method, of class AppointmentDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("AppointmentDal selectAll");
        AppointmentDal instance = new AppointmentDal();
        List<Appointment> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
        System.out.println(result);
    }

    /**
     * Test of selectById method, of class AppointmentDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("AppointmentDal selectById");
        int id = 1;
        AppointmentDal instance = new AppointmentDal();
        Appointment result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id);
    }
    
   /**
     * Test of insert method, of class AppointmentDal.
     */
    @Test
    public void testInsert() {
        System.out.println("AppointmentDal insert");
        Date date = new Date(2017, 7, 15);
        Appointment appointment = new Appointment(0, 5, 1, date, 1);
        AppointmentDal instance = new AppointmentDal();
        int result = instance.update(appointment);
        assertTrue(result!=0 && result==1);
    }
    
    /**
     * Test of update method, of class AppointmentDal.
     */
    @Test
    public void testUpdate() {
        System.out.println("AppointmentDal update");
        Date date = new Date(2017, 7, 15);
        Appointment appointment = new Appointment(0, 5, 1, date, 2);
        AppointmentDal instance = new AppointmentDal();
        int result = instance.insert(appointment);
        assertTrue(result!=0 && result==1);
    }

    /**
     * Test of delete method, of class AppointmentDal.
     */
    @Test
    public void testDelete() {
        System.out.println("AppointmentDal deleteById");
        int id = 0;
        AppointmentDal instance = new AppointmentDal();
        int result = instance.delete(id);
        assertTrue(result!=0 && result==1);
    }
}
