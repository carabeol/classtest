/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice3;

/**
 *
 * @author lazaro
 */
public class ICE3 {

    public static void main(String[] args) {
       CurrencyConverter cc = new CurrencyConverter();
        double result = cc.conversor("MEX", "CAD",100);
        System.out.println("100 Mexican Pesos are: " + result + " CAD");
    }
}
