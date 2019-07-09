/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author remyb
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
    }
    
    

    /**
     * Test of getMyStr method, of class StringUtils.
     */
    @Test
    public void testGetMyStr() {
        System.out.println("getMyStr");
        StringUtils instance = null;
        String expResult = "";
        String result;
        result = instance.getMyStr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endsWithChar method, of class StringUtils.
     */
    @Test
    public void testEndsWithChar() {
        System.out.println("endsWithChar");
        char ch = ' ';
        StringUtils instance = null;
        boolean expResult = false;
        boolean result = instance.endsWithChar(ch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToUpperCase method, of class StringUtils.
     */
    @Test
    public void testConvertToUpperCase() {
        System.out.println("convertToUpperCase");
        StringUtils instance = null;
        String expResult = "";
        String result = instance.convertToUpperCase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnCharAt method, of class StringUtils.
     */
    @Test
    public void testReturnCharAt() {
        System.out.println("returnCharAt");
        int index = 0;
        StringUtils instance = null;
        char expResult = ' ';
        char result = instance.returnCharAt(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateToConcat method, of class StringUtils.
     */
    @Test
    public void testUpdateToConcat() {
        System.out.println("updateToConcat");
        String value = "";
        StringUtils instance = null;
        String expResult = "";
        String result = instance.updateToConcat(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
