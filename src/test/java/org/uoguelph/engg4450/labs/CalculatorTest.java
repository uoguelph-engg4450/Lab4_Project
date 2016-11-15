package org.uoguelph.engg4450.labs;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    private static ICalculator calculator;
    
    @BeforeClass
    public static void initCalculator(){
        calculator = new Calculator();
    }
    
/*    @Before
    public void beforeEachTest(){
        System.out.println("This is executed before each Test");
    }
    
    @After
    public void afterEachTest(){
        System.out.println("This is executed after each Test");;
    }*/
    
    @Test
    public void testSum(){
        int result = calculator.sum(3,4);
        assertEquals(7, result);
    }
    
    @Test
    public void testDivision(){
        try{
            int result = calculator.divide(10, 2);
            assertEquals(5, result);
        } catch (Exception e){
            e.printStackTrace(System.err);
        }
    }
    
    @Test(expected = Exception.class)
    public void testDivisionException() throws Exception {
        calculator.divide(10, 0);
    }
    
    @Ignore
    @Test
    public void testEqual(){
        boolean result = calculator.equalIntegers(20, 20);
        assertFalse(result);
    }
    
    @Ignore
    @Test
    public void testSubtraction(){
        int result = 10 - 3;
        assertTrue(result == 9);
    }     
}
