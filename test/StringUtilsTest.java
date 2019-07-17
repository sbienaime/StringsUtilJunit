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
 * 
 */
public class StringUtilsTest {
   
    StringUtils Utils = new StringUtils("test");
    
    
   
    
    
    // test that the StringUtils(String s) constructor initializes myStr to the correct value 
     @Test
    public void  TestStringUtilsConstructor_MyStr_Initialization() {
        
        
        
        
       }
    
    
     // test that the StringUtils(String s, boolean upper) constructor initializes myStr to the correct value 
     @Test
    public void  TestStringUtilsConstructor2_MyStr_Initialization() {
        
        
        
        
       }
    
    
    
    //test that the StringUtils(String s) constructor  throws an Invalid Parameter exception when it is passed a null argument 
     @Test
      public void  ConstructorNullParamException() {
        
        
        
        
       }
      
      //test that the StringUtils(String s, boolean upper) constructor  throws an Invalid Parameter exception when it is passed a null argument 
      @Test
      public void  Constructor2NullParamException() {
        
        
        
        
       }
      
      //Test that the consructor throws an NullPointerException when a string is empty 
       @Test
        public void  ConstructorEmptyParamException() {
        
        
        
        
       }
        
        
        //Test that the second consructor throws an NullPointerException  when a string variable is empty 
       @Test
        public void  Constructor2EmptyParamException() {
        
        
        
        
       }
       //Test that Constructor only accepts string arguments  
       @Test 
        public void  ConstructorInvalidDataTypeException() {
        
        
        
        
       }
        
        //Test that the second Constructor only accepts string arguments as the first argument  
       @Test 
        public void  Constructor2InvalidDataTypeException() {
        
        
        
        
       } 
        
        
          //Test that the second Constructor only accepts boolean arguments as the second argument  
       @Test 
        public void  Constructor2InvalidDataTypeExceptionArg2() {
        
        
        
        
       } 
        
        
          //Test that the second constructor stores a uppercase value in myStr when a boolean having a value equating to true is passed as its second argrument
       @Test 
        public void  testConstructor2UpperCase() {
        
        
        
        
       } 
        
        
         //Test that the second constructor stores a lowercase value in myStr when a boolean having a value equating to false  is passed as its second argrument
       @Test 
        public void  testConstructor2LowerCase() {
        
        
        
        
       } 
        
        
    

    /**
     * Test if getMyStr method, of class StringUtils returns the correct value for myStr
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
     * Test if endsWithChar method handles exception when a null character variable is  passed 
     */
    
    @Test
    public void testEndsWithCharwNull() {
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
     * Test if endsWithChar method handles exception when a empty character variable is  passed 
     */
    
    @Test
    public void testEndsWithCharwEmptyChar() {
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
     * Test if endsWithChar method returns true when myStr ends with the passed character
     */
      @Test
    public void testEndsWithCharTrue() {
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
     * Test if endsWithChar method returns false when myStr does not end with the passed  character
     */
      @Test
    public void testEndsWithCharFalse() {
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
     * Test if endsWithChar method throws exception when a non char data type is passed 
     */
      @Test
    public void testEndsWithCharInvalidDataType() {
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
     * Test if convertToUpperCase method returns myStr in uppercase when a valid argument is passed 
     */
    @Test
    public void testConvertToUpperCasewValidArg() {
        System.out.println("convertToUpperCase");
        StringUtils instance = null;
        String expResult = "";
        String result = instance.convertToUpperCase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
    /**
     * Test if convertToUpperCase method, of class StringUtils handles a null myStr variable
     */
    @Test
    public void testConvertToUpperCasewNull() {
        System.out.println("convertToUpperCase");
        StringUtils instance = null;
        String expResult = "";
        String result = instance.convertToUpperCase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
      /**
     * Test if convertToUpperCase method, of class StringUtils handles a empty myStr variable
     */
    @Test
    public void testConvertToUpperCasewEmpty() {
        System.out.println("convertToUpperCase");
        StringUtils instance = null;
        String expResult = "";
        String result = instance.convertToUpperCase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
     /**
     * Test if returnCharAt method handles null myStr
     */
    @Test
    public void testReturnCharAtwNull() {
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
     * Test if returnCharAt method handles empty myStr
     */
    @Test
    public void testReturnCharAtwEmpty() {
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
     * Test if returnCharAt method returns the right character when it is passed a valid argument
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
     * Test if updateToConcat method, of class StringUtil handles null myStr variable 
     */
    @Test
    public void testUpdateToConcatwNull() {
        System.out.println("updateToConcat");
        String value = "";
        StringUtils instance = null;
        String expResult = "";
        String result = instance.updateToConcat(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    /**
     * Test if updateToConcat method, of class StringUtils handles empty myStr
     */
    @Test
    public void testUpdateToConcatwEmpty() {
        System.out.println("updateToConcat");
        String value = "";
        StringUtils instance = null;
        String expResult = "";
        String result = instance.updateToConcat(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
     /**
     * Test if updateToConcat method, of class StringUtils works under normal conditions and returns expected values
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
