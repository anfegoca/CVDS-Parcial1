package edu.eci.pdsw.orderCalculator.validator;

import edu.eci.pdsw.orderCalculator.model.Dish;

public interface TaxValidator{

    public float getPercentaged(Dish d);
}