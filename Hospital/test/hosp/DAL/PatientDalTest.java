/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.DAL;

import java.util.List;
import hosp.model.Patient;
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
     * Test of update method, of class PatientDal.
     *
    @Test
    public void testUpdate() {
        assertTrue(false);
    }

    /**
     * Test of insert method, of class PatientDal.
     *
    @Test
    public void testInsert() {
        assertTrue(false);
    }

    /**
     * Test of delete method, of class PatientDal.
     *
    @Test
    public void testDelete() {
        assertTrue(false);
    }
    */
}
