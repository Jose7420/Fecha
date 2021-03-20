/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Homed
 */
public class FechaTest {
    
    public FechaTest() {
    }
    
   
    /**
     * Test of devuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha0() {
     
        int tipo = 0;
        Fecha instance = new Fecha();
        String expResult = "ERROR";
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        
    }
    @Test
     public void testDevuelveFecha1() {
       
        int tipo = 1;
        Fecha instance = new Fecha();
        String expResult = "2021/03";
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        
    }
     @Test
      public void testDevuelveFecha2() {
       
        int tipo = 2;
        Fecha instance = new Fecha();
        String expResult = "03/2021";
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        
    }
      
      @Test
       public void testDevuelveFecha3() {
      
        int tipo = 3;
        Fecha instance = new Fecha();
        String expResult = "03/21";
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        
    }

    
   
}
