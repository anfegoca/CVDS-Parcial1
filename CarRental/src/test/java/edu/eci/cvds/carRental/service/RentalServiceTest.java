package edu.eci.cvds.carRental.service;

import edu.eci.cvds.carRental.Exception.ExceptionValorInvalido;
import edu.eci.cvds.carRental.model.CarCategory;
import edu.eci.cvds.carRental.model.FrequentClientCategory;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link RentalService}
 */
public class RentalServiceTest {

	/**
	 * The class under test.
	 */
	private RentalService service = new RentalService();
        
        
        /**
         * Dias > 0
         */
	@Test
	public void CamionetaPlata() {
            
            try {
                Assert.assertEquals(0,(new BigDecimal("950000").compareTo(service.calculateCost(10,CarCategory.PICKUP,FrequentClientCategory.SILVER))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias > 0
         */
        @Test
	public void CamionetaOro() {

            try {
                Assert.assertEquals(0,(new BigDecimal("900000").compareTo(service.calculateCost(10,CarCategory.PICKUP,FrequentClientCategory.GOLD))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias > 0
         */
        @Test
	public void CamionetaDiamante() {

            try {
                Assert.assertEquals(0,(new BigDecimal("850000").compareTo(service.calculateCost(10,CarCategory.PICKUP,FrequentClientCategory.DIAMOND))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias > 0
         */
        @Test
	public void DeportivoPlata() {

            try {
                Assert.assertEquals(0,(new BigDecimal("760000").compareTo(service.calculateCost(10,CarCategory.SPORT,FrequentClientCategory.SILVER))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias > 0
         */
        @Test
	public void DeportivoOro() {

            try {
                Assert.assertEquals(0,(new BigDecimal("720000").compareTo(service.calculateCost(10,CarCategory.SPORT,FrequentClientCategory.GOLD))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias > 0
         */
        @Test
	public void DeportivoDiamante() {

            try {
                Assert.assertEquals(0,(new BigDecimal("680000").compareTo(service.calculateCost(10,CarCategory.SPORT,FrequentClientCategory.DIAMOND))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias > 0
         */
        @Test
	public void ElectricoPlata() {

            try {
                Assert.assertEquals(0,(new BigDecimal("475000").compareTo(service.calculateCost(10,CarCategory.ELECTRIC,FrequentClientCategory.SILVER))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias > 0
         */
        @Test
	public void ElectricoOro() {

            try {
                Assert.assertEquals(0,(new BigDecimal("450000").compareTo(service.calculateCost(10,CarCategory.ELECTRIC,FrequentClientCategory.GOLD))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias > 0
         */
        @Test
	public void ElectricoDiamante() {

            try {
                Assert.assertEquals(0,(new BigDecimal("425000").compareTo(service.calculateCost(10,CarCategory.ELECTRIC,FrequentClientCategory.DIAMOND))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = 0
         */
        @Test
	public void CamionetaPlataF1() {

            try {
                Assert.assertEquals(0,(new BigDecimal("0").compareTo(service.calculateCost(0,CarCategory.PICKUP,FrequentClientCategory.SILVER))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = -1
         */
        @Test
	public void CamionetaPlataF2() {
            try{
                BigDecimal res = service.calculateCost(-1,CarCategory.PICKUP,FrequentClientCategory.SILVER);
            }catch(ExceptionValorInvalido e){
                Assert.assertTrue(true);
            }
            
	}
        /**
         * Dias = 1
         */
        @Test
	public void CamionetaPlataF3() {

            try {
                Assert.assertEquals(0,(new BigDecimal("95000").compareTo(service.calculateCost(1,CarCategory.PICKUP,FrequentClientCategory.SILVER))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = 0
         */
        @Test
	public void CamionetaOroF1() {

            try {
                Assert.assertEquals(0,(new BigDecimal(0).compareTo(service.calculateCost(0,CarCategory.PICKUP,FrequentClientCategory.GOLD))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = -1
         */
        @Test
	public void CamionetaOroF2() {

            try{
                BigDecimal res = service.calculateCost(-1,CarCategory.PICKUP,FrequentClientCategory.GOLD);
            }catch(ExceptionValorInvalido e){
                Assert.assertTrue(true);
            }
	}
        /**
         * Dias = 1
         */
        @Test
	public void CamionetaOroF3() {

            try {
                Assert.assertEquals(0,(new BigDecimal("90000").compareTo(service.calculateCost(1,CarCategory.PICKUP,FrequentClientCategory.GOLD))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = 0
         */
        @Test
	public void CamionetaDiamanteF1() {

            try {
                Assert.assertEquals(0,(new BigDecimal(0).compareTo(service.calculateCost(0,CarCategory.PICKUP,FrequentClientCategory.DIAMOND))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = -1
         */
        @Test
	public void CamionetaDiamanteF2() {

            try{
                BigDecimal res = service.calculateCost(-1,CarCategory.PICKUP,FrequentClientCategory.DIAMOND);
            }catch(ExceptionValorInvalido e){
                Assert.assertTrue(true);
            }
	}
        /**
         * Dias = 1
         */
        @Test
	public void CamionetaDiamanteF3() {

            try {
                Assert.assertEquals(0,(new BigDecimal("85000").compareTo(service.calculateCost(1,CarCategory.PICKUP,FrequentClientCategory.DIAMOND))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = 0
         */
        @Test
	public void DeportivoPlataF1() {

            try {
                Assert.assertEquals(0,(new BigDecimal(0).compareTo(service.calculateCost(0,CarCategory.SPORT,FrequentClientCategory.SILVER))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = -1
         */
        @Test
	public void DeportivoPlataF2() {

            try{
                BigDecimal res = service.calculateCost(-1,CarCategory.SPORT,FrequentClientCategory.SILVER);
            }catch(ExceptionValorInvalido e){
                Assert.assertTrue(true);
            }
	}
        /**
         * Dias = 1
         */
        @Test
	public void DeportivoPlataF3() {

            try {
                Assert.assertEquals(0,(new BigDecimal("76000").compareTo(service.calculateCost(1,CarCategory.SPORT,FrequentClientCategory.SILVER))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = 0
         */
        @Test
	public void DeportivoOroF1() {

            try {
                Assert.assertEquals(0,(new BigDecimal(0).compareTo(service.calculateCost(0,CarCategory.SPORT,FrequentClientCategory.GOLD))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = -1
         */
        @Test
	public void DeportivoOroF2() {

            try{
                BigDecimal res = service.calculateCost(-1,CarCategory.SPORT,FrequentClientCategory.GOLD);
            }catch(ExceptionValorInvalido e){
                Assert.assertTrue(true);
            }
	}
        /**
         * Dias = 1
         */
        @Test
	public void DeportivoOroF3() {

            try {
                Assert.assertEquals(0,(new BigDecimal("45000").compareTo(service.calculateCost(1,CarCategory.ELECTRIC,FrequentClientCategory.GOLD))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = 0
         */
        @Test
	public void DeportivoDiamanteF1() {

            try {
                Assert.assertEquals(0,(new BigDecimal(0).compareTo(service.calculateCost(0,CarCategory.SPORT,FrequentClientCategory.DIAMOND))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = -1
         */
        @Test
	public void DeportivoDiamanteF2() {

            try{
                BigDecimal res = service.calculateCost(-1,CarCategory.SPORT,FrequentClientCategory.DIAMOND);
            }catch(ExceptionValorInvalido e){
                Assert.assertTrue(true);
            }
	}
        /**
         * Dias = 1
         */
        @Test
	public void DeportivoDiamanteF3() {

            try {
                Assert.assertEquals(0,(new BigDecimal("68000").compareTo(service.calculateCost(1,CarCategory.SPORT,FrequentClientCategory.DIAMOND))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = 0
         */
        @Test
	public void ElectricoPlataF1() {

            try {
                Assert.assertEquals(0,(new BigDecimal(0).compareTo(service.calculateCost(0,CarCategory.ELECTRIC,FrequentClientCategory.SILVER))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = -1
         */
        @Test
	public void ElectricoPlataF2() {

            try{
                BigDecimal res = service.calculateCost(-1,CarCategory.ELECTRIC,FrequentClientCategory.SILVER);
            }catch(ExceptionValorInvalido e){
                Assert.assertTrue(true);
            }
	}
        /**
         * Dias = 1
         */
        @Test
	public void ElectricoPlataF3() {

            try {
                Assert.assertEquals(0,(new BigDecimal("47500").compareTo(service.calculateCost(1,CarCategory.ELECTRIC,FrequentClientCategory.SILVER))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = 0
         */
        @Test
	public void ElectricoOroF1() {

            try {
                Assert.assertEquals(0,(new BigDecimal(0).compareTo(service.calculateCost(0,CarCategory.ELECTRIC,FrequentClientCategory.GOLD))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = -1
         */
        @Test
	public void ElectricoOroF2() {

            try{
                BigDecimal res = service.calculateCost(-1,CarCategory.ELECTRIC,FrequentClientCategory.GOLD);
            }catch(ExceptionValorInvalido e){
                Assert.assertTrue(true);
            }
	}
        /**
         * Dias = 1
         */
        @Test
	public void ElectricoOroF3() {

            try {
                Assert.assertEquals(0,(new BigDecimal("45000").compareTo(service.calculateCost(1,CarCategory.ELECTRIC,FrequentClientCategory.GOLD))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = 0
         */
        @Test
	public void ElectricoDiamanteF1() {

            try {
                Assert.assertEquals(0,(new BigDecimal(0).compareTo(service.calculateCost(0,CarCategory.ELECTRIC,FrequentClientCategory.DIAMOND))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        /**
         * Dias = -1
         */
         @Test
	public void ElectricoDiamanteF2() {

            try{
                BigDecimal res = service.calculateCost(-1,CarCategory.ELECTRIC,FrequentClientCategory.DIAMOND);
            }catch(ExceptionValorInvalido e){
                Assert.assertTrue(true);
            }
	}
        /**
         * Dias = 1
         */
         @Test
	public void ElectricoDiamanteF3() {

            try {
                Assert.assertEquals(0,(new BigDecimal("42500").compareTo(service.calculateCost(1,CarCategory.ELECTRIC,FrequentClientCategory.DIAMOND))));
            } catch (ExceptionValorInvalido ex) {
                Logger.getLogger(RentalServiceTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        
}
