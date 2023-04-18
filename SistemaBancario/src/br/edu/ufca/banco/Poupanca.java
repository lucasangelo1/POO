package br.edu.ufca.banco;

public class Poupanca extends Conta{
	
	private double taxaJuros;
	
	public Poupanca(String n, double s, Cliente c, double j) {
		super(n,s,c);
		this.taxaJuros = j;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void renderJuros() {
		double saldo = this.consultarSaldo();
		this.creditar(saldo*this.taxaJuros);
	}
	
	

}
