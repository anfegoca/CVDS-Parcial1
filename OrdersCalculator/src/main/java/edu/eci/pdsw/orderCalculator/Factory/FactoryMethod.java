/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.orderCalculator.Factory;

import edu.eci.pdsw.orderCalculator.calculator.BillCalculator;
import edu.eci.pdsw.orderCalculator.calculator.impl.BasicBillCalculator;
import edu.eci.pdsw.orderCalculator.calculator.impl.TaxBillCalculator;
import edu.eci.pdsw.orderCalculator.calculator.impl.TipBillCalculator;
import edu.eci.pdsw.orderCalculator.services.OrdersManager;
import edu.eci.pdsw.orderCalculator.validator.TaxValidator;
import edu.eci.pdsw.orderCalculator.validator.impl.SpecialRegimeTaxValidator;
import edu.eci.pdsw.orderCalculator.validator.impl.StandardTaxValidator;

/**
 *
 * @author andres.gonzalez-ca
 */
public class FactoryMethod {
    
    public static OrdersManager createOrdersManager(String calculadora, String validator){
        BillCalculator cal =null;
        if(null != calculadora)switch (calculadora) {
            case "Basic":
                cal = new BasicBillCalculator();
                break;
            case "Tax":
 
                if(validator == "Standard"){
                    TaxValidator val = new StandardTaxValidator();
                    cal = new TaxBillCalculator(val);
                    
                }else if(validator == "Special"){
                    TaxValidator val= new SpecialRegimeTaxValidator();
                    cal = new TaxBillCalculator(val);
                }
       
                
                break;
            case "Tip":
                cal = new TipBillCalculator();
                break;
            default:
                break;
        }
        return new OrdersManager(cal);
    }
    
}
