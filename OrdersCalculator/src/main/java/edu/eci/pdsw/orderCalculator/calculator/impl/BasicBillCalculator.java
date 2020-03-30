package edu.eci.pdsw.orderCalculator.calculator.impl;

import edu.eci.pdsw.orderCalculator.model.Order;
import edu.eci.pdsw.orderCalculator.model.Dish;
import edu.eci.pdsw.orderCalculator.calculator.BillCalculator;

public class BasicBillCalculator implements BillCalculator {

    public int calculatePrice(Order o) {
        int total = 0;
        for (Dish p : o.getDishes()){
            total += p.getPrice();
        }
        return total;
    }
}
