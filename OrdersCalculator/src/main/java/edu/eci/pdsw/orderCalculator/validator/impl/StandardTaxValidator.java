package edu.eci.pdsw.orderCalculator.validator.impl;

import edu.eci.pdsw.orderCalculator.validator.TaxValidator;
import edu.eci.pdsw.orderCalculator.model.Dish;

public class StandardTaxValidator implements TaxValidator{

    public float getPercentaged(Dish d){
        return (float) 0.19;
    }
}