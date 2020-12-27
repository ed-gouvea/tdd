package fatura;

import java.util.Date;

public class Boleto {
	
	private int id;
	private Date data;
	private double valor;
	
	public Boleto(int id, Date data, double valor) {
		this.id = id;
		this.data = data;
		this.valor = valor;
	}
	
	public int getId() {
		return id;
	}
	
	public Date getData() {
		return data;
	}
	
	public double getValor() {
		return valor;
	}

}
