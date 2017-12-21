/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.DAL;

import hosp.model.Doctor;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Евгений Мартыненко L
 */
public class DoctorDalTest {
    
    public DoctorDalTest() {
    }

    /**
     * Test of selectAll method, of class DoctorDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("DoctorDal selectAll");
        DoctorDal instance = new DoctorDal();
        List<Doctor> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
        System.out.println(result);
    }

    /**
     * Test of selectBySpecialization method, of class DoctorDal.
     */
    @Test
    public void testSelectBySpecialization() {
        System.out.println("DoctorDal selectBySpecialization");
        DoctorDal instance = new DoctorDal();
        String specialization ="Терапевт";
        List<Doctor> result = instance.selectBySpecialization(specialization);
        assertTrue(result!=null && result.size()>0);
        System.out.println(result);
    }

    /**
     * Test of selectById method, of class DoctorDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("DoctorDal selectById");
        int id = 1;
        DoctorDal instance = new DoctorDal();
        Doctor result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id);
        System.out.println(result);
    }
    
    /**
     * Test of insert method, of class DoctorDal.
     */
    @Test
    public void testInsert() {
        System.out.println("DoctorDal insert");
        byte[] photo = new byte[1024];
        Doctor doctor = new Doctor(0, "Гусаров Роман Миронович", "Хирург", "89135734827", photo);
        DoctorDal instance = new DoctorDal();
        int result = instance.update(doctor);
        assertTrue(result!=0 && result==1);
    }
    
    /**
     * Test of update method, of class DoctorDal.
     */
    @Test
    public void testUpdate() {
        System.out.println("DoctorDal update");
        byte[] photo = new byte[1024];
        Doctor doctor = new Doctor(0, "Гусаров Роман Миронович", "Хирург", "89503743625", photo);
        DoctorDal instance = new DoctorDal();
        int result = instance.insert(doctor);
        assertTrue(result!=0 && result==1);
    }

    /**
     * Test of delete method, of class DoctorDal.
     */
    @Test
    public void testDelete() {
        System.out.println("DoctorDal deleteById");
        int id = 0;
        DoctorDal instance = new DoctorDal();
        int result = instance.delete(id);
        assertTrue(result!=0 && result==1);
    }
}
