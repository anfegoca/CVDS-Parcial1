package edu.eci.pdsw.orderCalculator.main;

import edu.eci.pdsw.orderCalculator.Factory.FactoryMethod;
import edu.eci.pdsw.orderCalculator.model.Order;
import edu.eci.pdsw.orderCalculator.model.OrderCalculatorException;
import edu.eci.pdsw.orderCalculator.model.Dish;
import edu.eci.pdsw.orderCalculator.model.DishType;
import edu.eci.pdsw.orderCalculator.services.OrdersManager;

public class Pos {

    private static void loadOrders(OrdersManager manager) {

        Order o = new Order();
        o.addDish(new Dish(DishType.PLATE, "pizza", 7500, 266));
        o.addDish(new Dish(DishType.DRINK, "pepsi 300ml", 3900, 123));
        o.addDish(new Dish(DishType.PLATE, "hamburguesa", 8000, 295));
        o.addDish(new Dish(DishType.DRINK, "sprite 300ml", 2000, 1020));
        manager.placeOrder(o);

        o = new Order();
        o.addDish(new Dish(DishType.PLATE, "pizza", 7500, 266));
        o.addDish(new Dish(DishType.PLATE, "pizza", 7500, 266));
        o.addDish(new Dish(DishType.PLATE, "pizza", 7500, 266));
        o.addDish(new Dish(DishType.DRINK, "pepsi litro", 5000, 123));
        manager.placeOrder(o);
    }

    public static void main(String a[]) throws OrderCalculatorException {
        OrdersManager manager = FactoryMethod.createOrdersManager(a[0],a[1]);
        loadOrders(manager);

        System.out.println(manager.calculateOrderTotal(0));
        System.out.println(manager.calculateOrderTotal(1));
    }
}
