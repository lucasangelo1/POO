package br.edu.ufca.banco;

public class ContaBonificada extends Conta{
	
	private double bonus;
	private double taxaBonus;
	public ContaBonificada(String n, double s, 
			Cliente c, double taxaBonus) {
		super(n, s, c);
		this.taxaBonus = taxaBonus;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getTaxaBonus() {
		return taxaBonus;
	}
	public void setTaxaBonus(double taxaBonus) {
		this.taxaBonus = taxaBonus;
	}
	
	@Override
	public void creditar(double valor) {
		this.bonus = this.bonus + valor*this.taxaBonus;
		super.creditar(valor);
	}
	
	public void renderBonus() {
		super.creditar(this.bonus);
		this.bonus = 0;
	}
	
	

}
