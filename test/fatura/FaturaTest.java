package fatura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.Assert;

class FaturaTest {

	@BeforeEach
	public void setUp() {
		Fatura fatura1 = new Fatura();
	}
	
	@Test
	void FaturaPaga() {
		Fatura fatura1 = new Fatura();
		Assert.assertEquals(true, fatura1.isPaga());
	}

}
