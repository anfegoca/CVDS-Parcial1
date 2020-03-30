package edu.eci.pdsw.orderCalculator.calculator.impl;

import edu.eci.pdsw.orderCalculator.model.Order;
import edu.eci.pdsw.orderCalculator.model.Dish;
import edu.eci.pdsw.orderCalculator.calculator.BillCalculator;

public class TipBillCalculator implements BillCalculator {
	
    public int calculatePrice(Order o) {
        int total = 0;
        for (Dish p : o.getDishes()){
            total += p.getPrice();
        }
        if (total > 15000) {
            total += total*0.1;
            
        }
        return total;
    }
}