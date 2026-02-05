/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ice3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lazaro
 */
public class CurrencyConverterTest {
    
  
    @Test
    public void testConversorSameCurrency() {
        System.out.println("conversor same currency");
        String currency1 = "CAD";
        String currency2 = "CAD";
        double amount = 100;
        CurrencyConverter instance = new CurrencyConverter();
        double expResult = 100;
        double result = instance.conversor(currency1, currency2, amount);
        assertEquals(expResult, Math.round(result * 100.0) / 100.0);
      
    }
    
    
     @Test
    public void testConversorUnknownCurrency() {
        System.out.println("conversor unknown currency");
        String currency1 = "CUB";
        String currency2 = "CAD";
        double amount = 100;
        CurrencyConverter instance = new CurrencyConverter();
        double expResult = 0.0;
        double result = instance.conversor(currency1, currency2, amount);
        assertEquals(expResult, result);
      
    }
    
    
     @Test
    public void testConversorFromCADtoUSD() {
        System.out.println("conversor currency from CAD to USD");
        String currency1 = "CAD";
        String currency2 = "USD";
        double amount = 1;
        CurrencyConverter instance = new CurrencyConverter();
        double expResult = 0.74;
        double result = instance.conversor(currency1, currency2, amount);
        assertEquals(expResult, Math.round(result * 100.0) / 100.0);
      
    }
    
    
      @Test
    public void testConversorFromUSDtoCADLowercase() {
        System.out.println("conversor currency from CAD to USD");
        String currency1 = "usd";
        String currency2 = "cad";
        double amount = 1;
        CurrencyConverter instance = new CurrencyConverter();
        double expResult = 1.35;
        double result = instance.conversor(currency1, currency2, amount);
        assertEquals(expResult, Math.round(result * 100.0) / 100.0);
      
    }
    
        @Test
    public void testConversorAmountIsZero() {
        System.out.println("conversor currency fwhen amount 0");
        String currency1 = "usd";
        String currency2 = "cad";
        double amount = 0;
        CurrencyConverter instance = new CurrencyConverter();
        double expResult = 0.0;
        double result = instance.conversor(currency1, currency2, amount);
        assertEquals(expResult, Math.round(result * 100.0) / 100.0);
      
    }
    
        @Test
    public void testConversorAmountIsNegative() {
        System.out.println("conversor currency fwhen amount negative");
        String currency1 = "usd";
        String currency2 = "cad";
        double amount = -10;
        CurrencyConverter instance = new CurrencyConverter();
        double expResult = 0.0;
        double result = instance.conversor(currency1, currency2, amount);
        assertEquals(expResult, Math.round(result * 100.0) / 100.0);
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
