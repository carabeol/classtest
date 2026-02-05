/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice3;

/**
 *
 * @author lazaro
 */
public class CurrencyConverter {
    double USD = 1.0;
    double CAD = 1.35;   
    double MEX = 17.22;  
    double EUR = 0.84;   
    double IND = 91.80;
//    
//double conversor(String currency1, String currency2, double amount) {
//    double ori = 0.0;
//    double dest = 0.0;
//
//    if (currency1.equalsIgnoreCase("USD")) {
//        ori = USD;
//    } else if (currency1.equalsIgnoreCase("CAD")) {
//        ori = CAD;
//    } else if (currency1.equalsIgnoreCase("MEX")) {
//        ori = MEX;
//    } else if (currency1.equalsIgnoreCase("EUR")) {
//        ori = EUR;
//    } else if (currency1.equalsIgnoreCase("IND")) {
//        ori = IND;
//    }
//
//    if (currency2.equalsIgnoreCase("USD")) {
//        dest = USD;
//    } else if (currency2.equalsIgnoreCase("CAD")) {
//        dest = CAD;
//    } else if (currency2.equalsIgnoreCase("MEX")) {
//        dest = MEX;
//    } else if (currency2.equalsIgnoreCase("EUR")) {
//        dest = EUR;
//    } else if (currency2.equalsIgnoreCase("IND")) {
//        dest = IND;
//    }
//
//    if (ori == 0.0 || dest == 0.0) {
//        return 0.0;
//    }
//
//    return (amount / ori) * dest;
//}
    
    double conversor(String currency1,String currency2, double amount){
        
        if (amount<0){
        return 0.0;
                }
        
      double ori = getRate(currency1);
      if(ori==0){
      return 0.0;}
      double dest = getRate(currency2);
        

       
        return (amount / ori) * dest;
    }
    
    private double getRate(String currency) {
        switch (currency.toUpperCase()) {
            case "USD": return USD;
            case "CAD": return CAD;
            case "MEX": return MEX;
            case "EUR": return EUR;
            case "IND": return IND;
            default: return 0.0;
        }
    }
    
   
    
}
