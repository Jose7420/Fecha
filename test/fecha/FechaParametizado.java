/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Homed
 */
@RunWith(Parameterized.class)
public class FechaParametizado {
    

    private String fe;
    private int tipo;
    
    @Parameters
    public static Collection<Object []> numeros(){
        
        return Arrays.asList(new Object [][] {
            {1,"2021/03"},
            {2,"03/2021"},
            {3,"03/21"},
            {0,"ERROR"}
        });
    }
    
   public FechaParametizado(int tipo, String fe){
    
        
        this.tipo = tipo;
        this.fe = fe;
    
    }

    /**
     * Test of devuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha() {
        
       
        Fecha instance = new Fecha();
        String expResult = fe;
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        
    }
}

