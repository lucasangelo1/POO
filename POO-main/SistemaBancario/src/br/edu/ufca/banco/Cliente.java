package br.edu.ufca.banco;

public class Cliente {
	
	private String nome;
	private String cpf;
	
	public Cliente(String n, String cpf){
		this.nome = n;
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object c) {
		if(this.cpf.equals(((Cliente)c).cpf)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		String r = "Nome: " + this.nome + 
				"\nCPF: " + this.cpf;
		return r;
	}

}
