package edu.eci.cvds.carRental.service;

import edu.eci.cvds.carRental.Exception.ExceptionValorInvalido;
import java.math.BigDecimal;

import edu.eci.cvds.carRental.model.CarCategory;
import edu.eci.cvds.carRental.model.FrequentClientCategory;

/**
 * Rental Service class in charge of calculating the rental cost of a car
 */
public class RentalService {

	/**
	 * Calculate the cost of renting a car, depending on the car category, the number of days and the client category
	 *
	 * @param numDays        The number of days to rent the car
	 * @param carCategory    The car category
	 * @param clientCategory The client category
	 * @return The amount to be charged to the client
	 */
	public BigDecimal calculateCost(final Integer numDays, final CarCategory carCategory,final FrequentClientCategory clientCategory) throws ExceptionValorInvalido{
            BigDecimal cost = null;
            if(numDays > 0){
                if(null != carCategory)switch (carCategory) {
                    case PICKUP:
                        cost = new BigDecimal("100000").multiply(new BigDecimal(numDays));
                        if(null != clientCategory)switch (clientCategory) {
                            case SILVER:
                                cost=cost.subtract(cost.multiply(new BigDecimal("5").divide(new BigDecimal("100"))));
                                break;
                            case GOLD:
                                cost=cost.subtract(cost.multiply(new BigDecimal("10").divide(new BigDecimal("100"))));
                                break;
                            case DIAMOND:
                                cost=cost.subtract(cost.multiply(new BigDecimal("15").divide(new BigDecimal("100"))));
                                break;
                            default:
                                break;
                        }   break;
                    case SPORT:
                        cost = new BigDecimal("80000").multiply(new BigDecimal(numDays));
                        if(null != clientCategory)switch (clientCategory) {
                            case SILVER:
                                cost=cost.subtract(cost.multiply(new BigDecimal("5").divide(new BigDecimal("100"))));
                                break;
                            case GOLD:
                                cost=cost.subtract(cost.multiply(new BigDecimal("10").divide(new BigDecimal("100"))));
                                break;
                            case DIAMOND:
                                cost=cost.subtract(cost.multiply(new BigDecimal("15").divide(new BigDecimal("100"))));
                                break;
                            default:
                                break;
                        }   break;
                    case ELECTRIC:
                        cost = new BigDecimal("50000").multiply(new BigDecimal(numDays));
                        if(null != clientCategory)switch (clientCategory) {
                            case SILVER:
                                cost=cost.subtract(cost.multiply(new BigDecimal("5").divide(new BigDecimal("100"))));
                                break;
                            case GOLD:
                                cost=cost.subtract(cost.multiply(new BigDecimal("10").divide(new BigDecimal("100"))));
                                break;
                            case DIAMOND:
                                cost=cost.subtract(cost.multiply(new BigDecimal("15").divide(new BigDecimal("100"))));
                                break;
                            default:
                                break;
                        }   break;
                    default:
                        break;
                }
                
            }else if(numDays == 0){
                cost = new BigDecimal("0");
            }else{
                new ExceptionValorInvalido(ExceptionValorInvalido.mensajeInvalido);
            }
                
            
            return cost;
	}

	/*
	 * Tip: Siempre que se desee realizar cálculos matemáticos de alta precisión (por ejemplo para temas de dinero)
	 * es mucho más confiable usar el tipo de dato BigDecimal, pues soporta un alto rango de número, decimales y
	 * tiene mayor precisión en los cálculos. <br />
	 * Ejemplos básicos de operaciones con BigDecimal, teniendo las variables `bd1` y `bd2`:
	 * <ul>
	 * <li>Creación: <code>BigDecimal nuevo = new BigDecimal(10);</code></li>
	 * <li>Sumas: <code>BigDecimal suma = bd1.add(bd2);</code></li>
	 * <li>Restas: <code>BigDecimal resta = bd1.subtract(bd2);</code></li>
	 * <li>Multiplicación: <code>BigDecimal multiplicacion = bd1.multiply(bd2);</code></li>
	 * <li>División: <code>BigDecimal division = bd1.divide(bd2);</code></li>
	 * </ul>
	 */

}
