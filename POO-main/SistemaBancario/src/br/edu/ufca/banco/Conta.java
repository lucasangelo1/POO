package br.edu.ufca.banco;
 
public class Conta {
	
	private String numero;
	private double saldo;
	private Cliente cliente;
	
	
	
	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Conta(String num, double sal, Cliente c){
		this.numero = num;
		this.saldo = sal;
		this.cliente = c;
	}
	
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public void debitar(double valor) {
		if(valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Saque realizado");
		}else {
			System.out.println("Saque não realizado "
					+ "(saldo insuficiente).");
		}
	}
	
	public void transferir(Conta c, double valor) {
	
	}
	
	@Override
	public String toString() {
		String resultado = "Conta nº " + numero + 
				"\nSaldo R$" + saldo + 
				"\nCliente: " +this.cliente.getNome();
		return resultado;
	}
	
	public boolean equals(Conta c) {
		if(this.numero.equals(c.numero)) {
			return true;
		}else {
			return false;
		}
	}

}
