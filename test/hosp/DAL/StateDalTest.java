/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.DAL;

import java.util.List;
import hosp.model.State;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Glover
 */
public class StateDalTest {
    
    public StateDalTest() {
    }

    /**
     * Test of selectAll method, of class StateDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("StateDal selectAll");
        StateDal instance = new StateDal();
        List<State> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
        System.out.println(result);
    }

    /**
     * Test of selectById method, of class StateDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("StateDal selectById");
        int id = 1;
        StateDal instance = new StateDal();
        State result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id);
    }
}
