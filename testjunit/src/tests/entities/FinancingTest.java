package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTest {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		// arrange
		
		// action
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// assert
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmmountShouldToUpadateValueWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setTotalAmount(90000.0);
		
		// assert
		Assertions.assertEquals(90000.0, f.getTotalAmount());
		
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			
			f.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldToUpdateValueWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setIncome(2600.0);
		
		Assertions.assertEquals(2600.0, f.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 1800.0, 80);
		});
	}
	
	@Test
	public void setMonthsShouldToUpdateValueWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setMonths(85);
		
		Assertions.assertEquals(85, f.getMonths());
	}
	
	@Test
	public void setMonthsThrowIllegalArgumentExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing f = new Financing(100000.0, 2000.0, 75);
		});
	}
	
	@Test
	public void entryMethodShouldCalculateCorrectlyValueEntry() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(20000.0, f.entry());
	}
	
	@Test
	public void quotaMethodShouldCalculateCorrectlyValueOfinstallment() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1000.0, f.quota());
	}
}
