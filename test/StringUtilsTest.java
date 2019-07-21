/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.security.InvalidParameterException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
/**
 *
 * 
 */
public class StringUtilsTest {
    int num = 0;
   
  
    String expResult;
     
     
    // test that the StringUtils(String s) constructor initializes myStr to the correct value 
     @Test //Test 1-- Passed 
    public void  TestStringUtilsConstructor1_MyStr_Initialization() {
         StringUtils Utils = new StringUtils("test");
         if(Utils.getMyStr().contentEquals("test"))
         {assertTrue(true);}
         else{
         fail(" The constructor does not properly initialize myStr");
         } 
       }
     
    
    //test that the StringUtils(String s) constructor  throws an NullPointerException when it is passed a null argument 
     @Test(expected=NullPointerException.class)//Test 2 --Failed 1 throws Invalid parmater exception instead of null pointer
      public void  Constructor1NullParamException() {
         StringUtils Utils = new StringUtils(null);
      }
      
      
       //Test that consructor1 throws an NullPointerException when a string is empty 
       @Test(expected=NullPointerException.class)//Test 3-- Failed 2 throws Invalid parmater exception instead of null pointer
        public void  Constructor1EmptyParamException() {
         StringUtils Utils2 = new StringUtils(""); 
       }
        
        
  
        
      
      //test that the StringUtils(String s, boolean upper) constructor  throws an NullPointerException when a string is null
      @Test(expected=NullPointerException.class)//Test 4
     public void  Constructor2NullParamException() {
         StringUtils Utils = new StringUtils(null, true);
       }
        
        
       
      
     
        
        
        //Test that consructor2 throws a NullPointerException  when a string variable is empty 
        @Test(expected=NullPointerException.class)// Test5--Failed 3 Does not throw an exception 
        public void  Constructor2EmptyParamException() {
        StringUtils Utils = new StringUtils("", true);
       }
     
   
        
        
   
        
        
          //Test that the second constructor stores a uppercase value in myStr when a boolean having a value equating to true is passed as its second argrument
       @Test //Test 6
        public void  testConstructor2UpperCase() {
        StringUtils Utils = new StringUtils("test",true);
         if(Utils.getMyStr().contentEquals("TEST"))
         {assertTrue(true);}
         else{
         
         fail(" The constructor does not properly initialize myStr");
         
         }
        
       } 
        
        
         //Test that the second constructor stores a lowercase value in myStr when a boolean having a value equating to false  is passed as its second argrument
       @Test //Test 7
        public void  testConstructor2LowerCase() {
         StringUtils Utils = new StringUtils("TEST",false);
         if(Utils.getMyStr().contentEquals("test"))
         {assertTrue(true);}
         else{
         fail(" The constructor does not properly initialize myStr");
         }
        
        
       } 
        
        
    

    /**
     * Test if getMyStr method, of class StringUtils returns the correct value for myStr
     */
    @Test//Test 8
    public void testGetMyStr() {
         StringUtils Utils = new StringUtils("test");
        String expResult = "test";
        String result;
        result = Utils.getMyStr();
        assertEquals(expResult, result);
     
    }

    /**
     * Test if endsWithChar  returns false when myStr does not end with the character passed 
     */
    
    @Test//Test 9
    public void testEndsWithCharFalse() {
       StringUtils instance = new StringUtils("test");
       boolean Result;
       Result=instance.endsWithChar('k');
       assertEquals(false, Result);
       
    }
    
    
    
       /**
     * Test if endsWithChar method returns true when myStr ends with the passed character
     */
      @Test//Test 10 
    public void testEndsWithCharTrue() {
        StringUtils Utils = new StringUtils("test");
        char ch = 't';
       
        boolean result = Utils.endsWithChar(ch);
        System.out.println(result);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
        
    
    }

    
    
    
    
     
  
   
    
   /**
     * Test if convertToUpperCase method returns myStr in uppercase when a valid argument is passed 
     */
    @Test//Test 11-- Failed 4 try to use contentEquals(String s) method with null parameter throws and exception
    public void testConvertToUpperCaseReturn() {
        StringUtils Utils = new StringUtils("test");
        expResult ="TEST";
        String result =Utils.convertToUpperCase();
        assertEquals(expResult ,result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

     /**
     * Test if convertToUpperCase method returns updates the value of myStr to uppercase when a valid argument is passed 
     */
    @Test//Test 11-- Failed 4 try to use contentEquals(String s) method with null parameter throws and exception
    public void testConvertToUpperCaseMyStr() {
        StringUtils Utils = new StringUtils("test");
        expResult ="TEST";
        String result =Utils.convertToUpperCase();
        assertEquals(expResult ,Utils.getMyStr());
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
   
   
    
    
    
    
         /**
     * Test if returnCharAt method returns the right character when it is passed a valid argument
     */
    @Test//Test 12 --passed
    public void testReturnCharAtwValid() {
        
        StringUtils Utils = new StringUtils("test");
        int index = 0;
        Utils.returnCharAt(index);
        
        char expResult ='t';
        char result = Utils.returnCharAt(index);
        System.out.println(result);
        assertEquals(expResult, result);
      
       
    }
    
    
    
    
    
    //Test 13 --Failed 5 threw NullPointerException instead of Index out of bound 
  @Test(expected=IndexOutOfBoundsException.class)
    public void testReturnCharAtUpperBound() {
        
        StringUtils Utils = new StringUtils("test");
        int index = 1000;
     
        Utils.returnCharAt(index);
     
    
    }
    
    
    //Test 14--Failed 6 threw Null Pointer exception instead of index out of bound
      @Test(expected=IndexOutOfBoundsException.class)
    public void testReturnCharAtLowerBound() {
        
        StringUtils Utils = new StringUtils("test");
        int index = -1;
      
        Utils.returnCharAt(index);
   }
    
    
    
    /**
     * Test if updateToConcat method, of class StringUtil throws InvalidParameterException
     */ // Test 15-- Failed 7 threw Null Pointer exception instead of InvalidParameter Exception
    @Test(expected=InvalidParameterException.class)// Test 15
    public void testUpdateToConcatwNull() {
       
        String value = null;
        StringUtils instance = new StringUtils("test");
       
        String result = instance.updateToConcat(value);
      
    }
    
    
    /**
     * Test if updateToConcat method throw InvalidParamaterException when string passed is empty
     */
     @Test(expected=InvalidParameterException.class)// Test 16--Failed 8 threw Null Pointer exception instead of InvalidParameter Exception
    public void testUpdateToConcatwEmpty() {
      
        String value = "";
        StringUtils instance = new StringUtils("test");
         instance.updateToConcat(value);
    }
    
    
     /**
     * Test if updateToConcat method, of class StringUtils works under normal conditions and returns expected value
     */
    @Test//Test 17
    public void testUpdateToConcatReturn() {
       
        String value = "hello";
       StringUtils instance = new StringUtils("test");
        String expResult = "testhello";
         
        String result = instance.updateToConcat(value);
        System.out.println(result);
        assertEquals(expResult, result);
        
    }
    
     /**
     * Test if updateToConcat method updates the value of myStr
     */
    @Test//Test 18
    public void testUpdateToConcatmyStr() {
       
        String value = "hello";
       StringUtils instance = new StringUtils("test");
       String expResult = "testhello";
         
       String result = instance.updateToConcat(value);
      
        assertEquals(expResult,instance.getMyStr());
        System.out.println(instance.getMyStr());
    }
    
    
}
