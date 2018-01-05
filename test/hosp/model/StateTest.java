/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp.model;

import hosp.model.State;
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
public class StateTest {
    
    public StateTest() {
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
     * Тест создания State.
     */
    @Test
    public void testCreateState() {
        System.out.println("test State createState");
        State state = new State(1, "name");
        assertEquals(state.getId(), 1);
        assertEquals(state.getName(), "name");
        
        state.setId(2);
        assertEquals(state.getId(), 2);
        
        state.setName("Неотмеченная");
        assertEquals(state.getName(), "Неотмеченная");
    }

    /**
     * Тест проверки равенства/неравенства State.
     */
    @Test
    public void testEquals() {
        System.out.println("test State equals");
        State state1 = new State(1, "name");        
        State state2 = new State(1, "name");
        State state3 = new State(2, "Неотмеченная");

        assertTrue( state1.equals(state2)   );
        assertFalse(state1.equals(state3)   );
    }
}