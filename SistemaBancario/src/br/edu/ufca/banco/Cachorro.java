package br.edu.ufca.banco;

public class Cachorro {
	
	//polimorfismo de sobrecarga ou estático (overload)
	public String reagir(double horaDoDia) {
		if(horaDoDia < 18) {
			return "au au au au";
		}else {
			return "au";
		}
	}
	
	public String reagir(String interagir) {
		String retorno = "";
		if(interagir.equals("bora tomar banho")) {
			retorno = "cain";
		}else if(interagir.equals("bora passear")) {
			retorno = "au au au au";
		}
		return retorno;
	}
	
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		System.out.println(c.reagir(16));
		System.out.println(c.reagir("bora tomar banho"));
	}

}
