package fatura;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.Assert;

class FaturaTest {

	Fatura fatura1, fatura2, fatura3;

	@BeforeEach
	public void setUp() {
		Boleto boleto1 = new Boleto(1,new Date(),500);
		Boleto boleto2 = new Boleto(2,new Date(),400);
		Boleto boleto3 = new Boleto(3,new Date(),600);
		Boleto boleto4 = new Boleto(4,new Date(),1000);
		Boleto boleto5 = new Boleto(5,new Date(),250);
		
		Date data = new Date();
		
		fatura1 = new Fatura(data, 1500, "Jose da Silva", false, new Boleto[] {boleto1, boleto2, boleto3});
		fatura2 = new Fatura(data, 1500, "Jose das Coves", false, new Boleto[] {boleto4, boleto1, boleto5});
		fatura3 = new Fatura(data, 2500, "Jose de Oliveira", false, new Boleto[] {boleto1, boleto2});
	}
	
	@Test
	void Fatura1Paga() {
		fatura1.ProcessadorDeBoletos();
		Assert.assertEquals(true, fatura1.isPaga());
	}

	@Test
	void Fatura2Paga() {
		fatura2.ProcessadorDeBoletos();
		Assert.assertEquals(true, fatura2.isPaga());
	}
	
	@Test
	void Fatura3Paga() {
		fatura3.ProcessadorDeBoletos();
		Assert.assertEquals(false, fatura3.isPaga());
	}

}
