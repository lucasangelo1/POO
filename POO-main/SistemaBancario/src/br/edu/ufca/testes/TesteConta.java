package br.edu.ufca.testes;

import java.util.ArrayList;

import br.edu.ufca.banco.Cliente;
import br.edu.ufca.banco.Conta;
import br.edu.ufca.banco.Poupanca;

public class TesteConta {

	public static void main(String[] args) {	
		
		Cliente cliente = new Cliente("Maria", "123456");
		Cliente c2 = new Cliente("Jose", "89382");
		Cliente c3 = new Cliente("Maria", "123456");
		Cliente c4 = cliente;
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(cliente);
		clientes.add(c2);
		System.out.println(clientes.contains(c4));
		System.out.println(clientes.contains(c3));
		
		
		
		
		

	}
}
