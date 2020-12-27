package fatura;

import java.util.Date;

public class Fatura {
	
	private Date data;
	private double valorTotal;
	private String NomeCliente;
	private boolean Paga;
	Boleto[] boletos;
	Pagamento[] pagamentos;
	
	public Fatura(Date data, double valorTotal, String NomeCliente, boolean paga, Boleto[] boletos) {
		this.data = data;
		this.valorTotal = valorTotal;
		this.NomeCliente = NomeCliente;
		this.Paga = paga;
		this.boletos = boletos;
	}
	
	public void ProcessadorDeBoletos() {
		double subTotal=0;
		int numBoletos=this.boletos.length, count=0;
		Pagamento[] pgtos = new Pagamento[numBoletos]; 
		
		for (Boleto boleto : boletos) {
			subTotal+=boleto.getValor();
			pgtos[count] = new Pagamento(new Date(), boleto.getValor(), "BOLETO");
			count++;
		}
		
		if (this.valorTotal <= subTotal) {
			this.Paga = true;
		}
	}
	
	public Date getData() {
		return data;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public String getNomeCliente() {
		return NomeCliente;
	}
	
	public Boleto[] getBoletos() {
		return boletos;
	}

	public Pagamento[] getPagamentos() {
		return pagamentos;
	}
	
	public boolean isPaga() {
		return Paga;
	}

}
