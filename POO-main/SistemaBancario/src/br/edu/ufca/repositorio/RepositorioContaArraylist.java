package br.edu.ufca.repositorio;

import java.util.ArrayList;

import br.edu.ufca.banco.Conta;

public class RepositorioContaArraylist {
	
	private ArrayList<Conta> contas;
	
	
	public RepositorioContaArraylist() {
		this.contas = new ArrayList<Conta>();
	}
	
	public void adiciona(Conta c) {
		this.contas.add(c);
	}
	
	@Override
	public String toString() {
		return this.contas.toString();
	}

}
