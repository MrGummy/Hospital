/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.DAL;

import java.util.List;
import hosp.model.Patient;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Glover
 */
public class PatientDalTest {
    
    public PatientDalTest() {
    }

    /**
     * Test of selectAll method, of class PatientDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("PatientDal selectAll");
        PatientDal instance = new PatientDal();
        List<Patient> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
        System.out.println(result);
    }

    /**
     * Test of selectById method, of class PatientDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("PatientDal selectById");
        int id = 1;
        PatientDal instance = new PatientDal();
        Patient result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id);
    }

    /**
     * Test of insert method, of class PatientDal.
     */
    @Test
    public void testInsert() {
        System.out.println("PatientDal insert");
        Date date = new Date(1974, 11, 30);
        Patient patient = new Patient(0 ,"Меньшов Гавриил Парфёнович", date);
        PatientDal instance = new PatientDal();
        int result = instance.update(patient);
        assertTrue(result!=0 && result==1);
    }
    
    /**
     * Test of update method, of class PatientDal.
     */
    @Test
    public void testUpdate() {
        System.out.println("PatientDal update");
        Date date = new Date(1974, 11, 30);
        Patient patient = new Patient(0, "Меньшов Гавриил Прокофьевич", date);
        PatientDal instance = new PatientDal();
        int result = instance.insert(patient);
        assertTrue(result!=0 && result==1);
    }

    /**
     * Test of delete method, of class PatientDal.
     */
    @Test
    public void testDelete() {
        System.out.println("PatientDal deleteById");
        int id = 0;
        PatientDal instance = new PatientDal();
        int result = instance.delete(id);
        assertTrue(result!=0 && result==1);
    }
}
