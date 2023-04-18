package br.edu.ufca.repositorio;

import br.edu.ufca.banco.*;

public class TesteRepositorio {
	
	public static void main(String[] args) {
		RepositorioContaArraylist contas = new RepositorioContaArraylist();
		Cliente cliente = new Cliente("Maria", "1234-6");
		Conta c = new Conta("1", 0, cliente);
		Poupanca p = new Poupanca("2", 0, cliente, 0.01);
		ContaBonificada cb = new ContaBonificada("3", 0, cliente, 0.01);
		contas.adiciona(c);
		contas.adiciona(p);
		contas.adiciona(cb);
		System.out.println(contas.toString());
		c.creditar(100);
		System.out.println(c.consultarSaldo());
		c = cb;
		c.creditar(100);
		((ContaBonificada)c).renderBonus();
		System.out.println(c.consultarSaldo());
		
	}

}
