package edu.eci.pdsw.orderCalculator.services;

import java.util.LinkedList;
import java.util.List;

import edu.eci.pdsw.orderCalculator.calculator.BillCalculator;
import edu.eci.pdsw.orderCalculator.calculator.impl.BasicBillCalculator;
import edu.eci.pdsw.orderCalculator.model.Order;
import edu.eci.pdsw.orderCalculator.model.OrderCalculatorException;

public class OrdersManager {

    private BillCalculator calc;
    private List<Order> orders;
    
    public OrdersManager(BillCalculator calculadora) {
    	calc = calculadora;
        orders = new LinkedList<Order>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
    }

    public Order findOrder(int n) throws OrderCalculatorException {
        if (n >= orders.size()) {
            throw new OrderCalculatorException("Order not found");
        }
        return orders.get(n);
    }

    public int calculateOrderTotal(int n) throws OrderCalculatorException {
        if (n >= orders.size()) {
            
            throw new OrderCalculatorException("Order not found");
        }
        
        return calc.calculatePrice(orders.get(n));
    }
}
