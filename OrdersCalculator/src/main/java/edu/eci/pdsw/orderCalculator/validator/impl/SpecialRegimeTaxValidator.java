package edu.eci.pdsw.orderCalculator.validator.impl;

import edu.eci.pdsw.orderCalculator.validator.TaxValidator;
import edu.eci.pdsw.orderCalculator.model.Dish;
import edu.eci.pdsw.orderCalculator.model.DishType;

public class SpecialRegimeTaxValidator implements TaxValidator{

    public float getPercentaged(Dish d){
        float percentaged = 0;
        if (d.getType() == DishType.DRINK && d.getCalories() > 1000){
            percentaged = (float) 0.29;
        }
        else {
            percentaged = (float) 0.19;
        }
        return percentaged;
    }
}