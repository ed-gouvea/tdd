package fatura;

import java.util.Date;

public class Pagamento {

	private Date data;
	private double valorPago;
	private String tipoPagamento;
	
	public Pagamento(Date data, double valorPago, String tipoPagamento) {
		this.data = data;
		this.valorPago = valorPago;
		this.tipoPagamento = tipoPagamento;
	}
	
	public Date getData() {
		return data;
	}
	
	public double getValorPago() {
		return valorPago;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

}